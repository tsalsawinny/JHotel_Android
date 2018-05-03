package com.example.tsalsawinny.jhotel_android_tsalsabillawinnyj;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by TSALSAWINNY 03/05/2018
 */

public class RegisterRequest extends StringRequest {
    private static final String Regis_URL = "http://10.0.2.2/newcustomer";
    private Map<String, String> params;

    public RegisterRequest(String name, String email, String password, Response.Listener<String> listener) {
        super(Method.POST, Regis_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("email",email); params.put("password", password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }


}