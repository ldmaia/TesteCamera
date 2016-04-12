package br.ufrpe.projetao.testecamera;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Lucas on 31/03/2016.
 */
public class SecondActivity extends AppCompatActivity {

    private TextView status,role,method;
    private View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


        status = (TextView)findViewById(R.id.textView6);
        role = (TextView)findViewById(R.id.textView7);
        method = (TextView)findViewById(R.id.textView9);

        try{
            loginPost(v);
            Toast.makeText(getApplicationContext(), "Connected Successful", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            e.printStackTrace();
        }



    }


    public void login(View view){
        //String username = usernameField.getText().toString();
        //String password = passwordField.getText().toString();
        method.setText("Get Method");
        //new SignInActivity(this,status,role,0).execute(username,password);

    }

    public void loginPost(View view){
        String username = "projectl_user";
        String password = "gangue69";
        method.setText("Post Method");
        new SignInActivity(this,status,role,1).execute(username, password);

    }
}
