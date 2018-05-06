package com.example.tsalsawinny.jhotel_android_tsalsabillawinnyj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BuatPesananActivity extends AppCompatActivity {
    private int currentUserid, banyakHari, idHotel;
    private double tariff;
    private double total_biaya = tariff*banyakHari;
    private String roomNumber;
    View.OnClickListener listener1 = null;
    View.OnClickListener listener2 = null;
    final TextView textViewRoomNumber = findViewById(R.id.room_number);
    final TextView textViewTariff = findViewById(R.id.tariff);
    final TextView textViewTotalBiaya = findViewById(R.id.total_biaya);
    final EditText durasiInput = findViewById(R.id.durasi_hari);
    final Button pesanButton = findViewById(R.id.pesan);
    final Button hitungButton = findViewById(R.id.hitung);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buat_pesanan);
        pesanButton.setVisibility(View.INVISIBLE);
        textViewRoomNumber.setText(roomNumber);
        textViewTariff.setText(String.valueOf(tariff));
        textViewTotalBiaya.setText("0");
        hitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent orderInt = getIntent();
                currentUserid = orderInt.getIntExtra("id_customer", 0);
                roomNumber = orderInt.getStringExtra("nomor_kamar");
                idHotel = orderInt.getIntExtra("id_hotel", 0);
                banyakHari = Integer.parseInt(durasiInput.getText().toString());
                textViewTotalBiaya.setText(String.valueOf(tariff*banyakHari));
                hitungButton.setVisibility(View.INVISIBLE);
                pesanButton.setVisibility(View.VISIBLE);
            }
        });
    }
}
