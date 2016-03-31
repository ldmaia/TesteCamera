package br.ufrpe.projetao.testecamera;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.TextView;

import java.net.URI;
import java.net.URL;

import org.apache.http.HttpResponse;

import org.apache.http.client.HttpClient;

import org.apache.http.client.methods.HttpGet;

import org.apache.http.impl.client.DefaultHttpClient;

import org.apache.http.params.CoreProtocolPNames;


/**
 * Created by Lucas on 30/03/2016.
 */
public class SignInActivity extends AsyncTask<String,Void,String> {
    private TextView statusField,roleField;
    private Context context;
    private int byGetOrPost = 0;

    public SignInActivity(Context context,TextView statusField,TextView roleField, int flag){
        this.context = context;
        this.statusField = statusField;
        this.roleField = roleField;
        byGetOrPost = flag;
    }


    protected void onPreExecute(){

    }

    @Override
    protected String doInBackground(String... arg0) {


        if(byGetOrPost == 0){
            try{
                String username = (String)arg0[0];
                String password = (String)arg0[1];
                String link = "http://myphpmysqlweb.hostei.com/login.php?username="+username+"& password="+password;

                //URL url = new URL(link);
                HttpClient client = new DefaultHttpClient();
                HttpGet request = new HttpGet();
                //request.setURI(new URI(link));
            }catch(Exception e){

            }
        }
        return null;
    }
}
