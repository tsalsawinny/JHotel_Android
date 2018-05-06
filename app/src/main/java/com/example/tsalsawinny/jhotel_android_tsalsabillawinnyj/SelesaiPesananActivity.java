package com.example.tsalsawinny.jhotel_android_tsalsabillawinnyj;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class SelesaiPesananActivity extends AppCompatActivity {
    private int id_customer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selesai_pesanan);

        id_customer = getIntent().getIntExtra("ID customer", 1);

       // TextView id = (TextView) findViewById(R.id.);
        //TextView idpesan = (TextView) findViewById(R.id.id_pesanan);
        TextView biaya = (TextView) findViewById(R.id.tariff);
        TextView biayapesanan = (TextView) findViewById(R.id.staticTariff);
        TextView hari = (TextView) findViewById(R.id.staticDurasi);
        TextView jumlahhari = (TextView) findViewById(R.id.durasi_hari);
        //TextView tanggal = (TextView) findViewById(R.id.s);
       // TextView tanggalpesan = (TextView) findViewById(R.id.tanggal_pesan);
       // Button batal = (Button) findViewById(R.id.);
       // Button selesai = (Button) findViewById(R.id.selesai);

    }
}
