package com.example.tsalsawinny.jhotel_android_tsalsabillawinnyj;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * java untuk register
 *
 * @author Tsalsabilla Winny Junika
 * @version 08-05-2018
 */


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

                if(TextUtils.isEmpty(name)){
                    nameRegis.setError( "Masukkan nama dengan benar!" );
                } else if(TextUtils.isEmpty(email)){
                    emailRegis.setError("Masukkan email dengan benar!");
                }else if(TextUtils.isEmpty(pass)){
                    passRegis.setError("Masukkan password dengan benar!");
                }else{
                Response.Listener<String> responseListener = new Response.Listener<String> () {
                    @Override
                    public void onResponse(String response) {
                        try{ JSONObject jsonResponse = new JSONObject(response);
                            if(jsonResponse!=null) {
                                AlertDialog.Builder builder=new AlertDialog.Builder(RegisterActivity.this);
                                builder.setMessage("Registrasi berhasil!") .create() .show();
                                Intent Intent3 = new Intent(RegisterActivity.this, LoginActivity.class);
                                startActivity(Intent3);
                            }
                        } catch (JSONException e) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                            builder.setMessage("Registrasi gagal :(") .create() .show();
                        }
                    }
                };

                RegisterRequest registerRequest = new RegisterRequest(name,email,pass,responseListener);
                RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
                queue.add(registerRequest);


                }
            }
        });
    }
}
