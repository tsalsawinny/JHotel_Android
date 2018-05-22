package com.example.tsalsawinny.jhotel_android_tsalsabillawinnyj;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * java untuk request menu
 *
 * @author Tsalsabilla Winny Junika
 * @version 08-05-2018
 */


public class MenuRequest extends StringRequest{

    private static final String Vacant_URL = "http://192.168.100.5:8080/vacantrooms";
    private Map<String, String> params;

    public MenuRequest(Response.Listener<String> listener) {
        super(Method.GET, Vacant_URL, listener, null);
        params = new HashMap<>();

    }
    @Override
    public  Map<String, String> getParams(){
        return params;
    }
}






