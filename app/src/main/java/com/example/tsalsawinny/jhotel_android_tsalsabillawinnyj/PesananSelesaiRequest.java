package com.example.tsalsawinny.jhotel_android_tsalsabillawinnyj;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;
public class PesananSelesaiRequest extends StringRequest {

    private static final String Selesai_URL = "http://192.168.100.7:8080/finishpesanan";
    private Map<String, String> params;

    public PesananSelesaiRequest(int id_pesanan, Response.Listener<String> listener) {
        super(Method.POST, Selesai_URL, listener, null);
        params = new HashMap<>();
        params.put("id pesanan", String.valueOf(id_pesanan));
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}

