package com.example.tsalsawinny.jhotel_android_tsalsabillawinnyj;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText nameRegis = (EditText) findViewById(R.id.regisName);
        final EditText emailRegis = (EditText) findViewById(R.id.regisEmail);
        final EditText passRegis = (EditText) findViewById(R.id.regisPass);
        final Button buttonRegis = (Button) findViewById(R.id.regisButton);

        buttonRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                final String name = nameRegis.getText().toString();
                final String email = emailRegis.getText().toString();
                final String pass = passRegis.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String> () {
                    @Override
                    public void onResponse(String response) {
                        try{ JSONObject jsonResponse = new JSONObject(response);
                            if(jsonResponse!=null) {
                                AlertDialog.Builder builder=new AlertDialog.Builder(RegisterActivity.this);
                                builder.setMessage("Registration Success") .create() .show();
                            }
                        } catch (JSONException e) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                            builder.setMessage("Registration Failed.") .create() .show();
                        }
                    }
                };

                RegisterRequest registerRequest = new RegisterRequest(name,email,pass,responseListener);
                RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
                queue.add(registerRequest);


            }
        });
    }
}