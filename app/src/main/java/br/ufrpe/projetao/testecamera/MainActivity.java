package br.ufrpe.projetao.testecamera;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.opencv.android.BaseLoaderCallback;
import org.opencv.android.CameraBridgeViewBase;
import org.opencv.android.LoaderCallbackInterface;
import org.opencv.android.OpenCVLoader;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;
import org.opencv.videoio.VideoCapture;

public class MainActivity extends AppCompatActivity implements CameraBridgeViewBase.CvCameraViewListener2 {

    // Variavel que seta camera frontal ou traseira
    private int mCameraId = 0;


    //Progress Dialog
    private ProgressDialog dialog;


    //Componente da camera do Opencv;
    private CameraBridgeViewBase mOpenCvCameraView;

    private LinearLayout layout;



    //Componentes do OpenCV
    private Mat edgesMat;
    private final Scalar greenScalar = new Scalar(0,255,0);
    boolean recording = false;


    private Button Bt_learn;
    private Button Bt_play;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Bt_learn = (Button) findViewById(R.id.Bt_learn);
    Bt_play =  (Button) findViewById(R.id.Bt_play);

        Bt_learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learnActivity = new Intent(MainActivity.this, LearnActivity.class);
                startActivity(learnActivity);
            }
        });


        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        //mOpenCvCameraView = (CameraBridgeViewBase) findViewById(R.id.HelloOpenCvView);
        //mOpenCvCameraView.setVisibility(SurfaceView.VISIBLE);
        //mOpenCvCameraView.setCvCameraViewListener(this);


        // componente da camera instanciado

        // ToolBar declarado e FloatingActionButton do layout

  //      Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

     /*   FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

*/
   }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }




    private BaseLoaderCallback mLoaderCallback = new BaseLoaderCallback(this) {
        @Override
        public void onManagerConnected(int status) {
            switch (status) {
                case LoaderCallbackInterface.SUCCESS:
                {
                    //Log.i(TAG, "OpenCV loaded successfully");
          //          mOpenCvCameraView.enableView();
                } break;
                default:
                {
                    super.onManagerConnected(status);
                } break;
            }
        }
    };

    @Override
    public void onResume()
    {
        super.onResume();
        OpenCVLoader.initAsync(OpenCVLoader.OPENCV_VERSION_3_1_0, this, mLoaderCallback);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            final ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
            progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progressDialog.setIcon(R.drawable.sinal_esperar2);
            progressDialog.setTitle("Aguarde...");
            progressDialog.setMessage("Carregando banco de dados...");
            progressDialog.setCancelable(false);
            progressDialog.show();
            //progressDialog.setIndeterminate(true);
            new Thread(){
                public void run(){
                    try {

                        Thread.sleep(3000);

                        Intent secondActivity = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(secondActivity);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    progressDialog.dismiss();
                }
            }.start();



        }
        if(id == R.id.action_swap_camera){
            swapCamera();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPause()
    {
        super.onPause();
        if (mOpenCvCameraView != null)
            mOpenCvCameraView.disableView();
    }

    public void onDestroy() {
        super.onDestroy();
        if (mOpenCvCameraView != null)
            mOpenCvCameraView.disableView();
    }


    @Override
    public void onCameraViewStarted(int width, int height) {
        edgesMat = new Mat();
    }

    @Override
    public void onCameraViewStopped() {
        if (edgesMat != null)
            edgesMat.release();

        edgesMat = null;
    }



    @Override
    public Mat onCameraFrame(CameraBridgeViewBase.CvCameraViewFrame inputFrame) {

        Mat rgba = inputFrame.rgba();
        org.opencv.core.Size sizeRgba = rgba.size();
        int rows = (int) sizeRgba.height;
        int cols = (int) sizeRgba.width;

        int left = cols / 8;
        int top = rows / 8;
        int width = cols * 3 / 4;
        int height = rows * 3 / 4;

        //get sub-image
        Mat rgbaInnerWindow = rgba.submat(top, top + height, left, left + width);

        //create edgesMat from sub-image

        Imgproc.Canny(rgbaInnerWindow, edgesMat, 100, 100);

        Mat colorEdges = new Mat();
        Mat killMe = colorEdges;
        edgesMat.copyTo(colorEdges);
        Imgproc.cvtColor(colorEdges, colorEdges, Imgproc.COLOR_GRAY2BGRA);

        colorEdges = colorEdges.setTo(greenScalar, edgesMat);
        colorEdges.copyTo(rgbaInnerWindow, edgesMat);

        killMe.release();
        colorEdges.release();

        rgbaInnerWindow.release();



        return rgba;
    }

    //Metodo que faz swap de camera frontal e traseira
    private void swapCamera() {
        mCameraId = mCameraId^1; //bitwise not operation to flip 1 to 0 and vice versa
        mOpenCvCameraView.disableView();
        mOpenCvCameraView.setCameraIndex(mCameraId);
        mOpenCvCameraView.enableView();
        if(mCameraId == 1) {
            Toast.makeText(getApplicationContext(), "Camera: Frontal ", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(), "Camera: Traseira ", Toast.LENGTH_SHORT).show();

        }
        }




}
