package com.example.tsalsawinny.jhotel_android_tsalsabillawinnyj;

public class Hotel {
    private int id;
    private  String nama;
    private Lokasi lokasi;
    private int bintang;

    public Hotel(int id, String nama, Lokasi lokasi, int bintang)
    {
        // initialise instance variables
        this.id = id;
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;


    }

    public int getID()
    {
        return id;
    }

    public String getNama()
    {
        return nama;
    }


    public Lokasi getLokasi()
    {
        return lokasi;
    }

    public int getBintang()
    {
        // put your code here
        return bintang;
    }


    public void setID(int id)
    {
        this.id = id;
    }

    public void setNama(String nama)
    {

        this.nama = nama;
    }

    public void setLokasi(Lokasi lokasi)

    {
        this.lokasi = lokasi;
    }


    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }

}
