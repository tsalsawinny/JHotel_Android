package com.example.tsalsawinny.jhotel_android_tsalsabillawinnyj;
import java.util.ArrayList;
import java.util.HashMap;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

public class PesananFetchRequest extends StringRequest {
    private static final  String Fetch_URL = "http://192.168.100.7:8080/pesanancust";

            public PesananFetchRequest(int id_cust, Response.Listener<String> listener) {
                super(Method.GET, Fetch_URL + id_cust, listener, null);

    }
}
