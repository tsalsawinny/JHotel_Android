package com.example.tsalsawinny.jhotel_android_tsalsabillawinnyj;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by TSALSAWINNY 03/05/2018
 */

public class LoginRequest extends StringRequest {
    private static final String Regis_URL = "http://10.0.2.2/logincust";
    private Map<String, String> params;

    public LoginRequest(String email, String password, Response.Listener<String> listener) {
        super(Method.POST, Regis_URL, listener, null);
        params = new HashMap<>();
        params.put("email",email);
        params.put("password", password);
    }


}