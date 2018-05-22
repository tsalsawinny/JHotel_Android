package com.example.tsalsawinny.jhotel_android_tsalsabillawinnyj;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * java untuk login
 *
 * @author Tsalsabilla Winny Junika
 * @version 08-05-2018
 */



public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText emailInput = findViewById(R.id.inputEmail);
        final EditText passInput = findViewById(R.id.inputPass);
        final Button loginButton = findViewById(R.id.buttonLogin);
        final TextView registerClickable = findViewById(R.id.registerClickable);

        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String email = emailInput.getText().toString();
                final String password = passInput.getText().toString();
                if (TextUtils.isEmpty(email)) {
                    emailInput.setError("Masukkan email dengan benar!");
                } else if (TextUtils.isEmpty(password)) {
                    passInput.setError("Masukkan password dengan benar");
                } else {
                    Response.Listener<String> responseListener = new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONObject jsonResponse = new JSONObject(response);
                                if (jsonResponse != null) {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                                    builder.setMessage("Login Berhasil!").create().show();

                                    Intent mainInt = new Intent(LoginActivity.this, DashboardActivity.class);
                                    mainInt.putExtra("id_customer", jsonResponse.getInt("id"));
                                    LoginActivity.this.startActivity(mainInt);
                                }
                            } catch (JSONException e) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                                builder.setMessage("Login Gagal!.").create().show();
                            }
                        }
                    };
                    LoginRequest loginRequest = new LoginRequest(email, password, responseListener);
                    RequestQueue queue = Volley.newRequestQueue(LoginActivity.this);
                    queue.add(loginRequest);
                }
            }
        });
        registerClickable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regisInt = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(regisInt);
            }
        });
    }
}