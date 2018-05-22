package com.example.tsalsawinny.jhotel_android_tsalsabillawinnyj;

/**
 * java untuk deskripsi hotel
 *
 * @author Tsalsabilla Winny Junika
 * @version 08-05-2018
 */


public class Hotel {
    private int id;
    private  String nama;
    private Lokasi lokasi;
    private int bintang;

    /**
     * Constructor for objects of class Hotel
     */
    public Hotel(int id, String nama, Lokasi lokasi, int bintang)
    {
        // initialise instance variables
        this.id = id;
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;


    }

    /**
     *  method untuk menentukan id
     *
     *
     * @return    ke id (identitas)
     */
    public int getID()
    {

        return id;
    }

    /**
     * method mendapatkan nama hotel
     *
     *
     * @return    ke nama hotel
     */
    public String getNama()
    {

        return nama;
    }

    /**
     * a method mendapatkan lokasi dimana hotel berada
     *
     *
     * @return  ke lokasi
     */
    public Lokasi getLokasi()
    {

        return lokasi;
    }

    /**
     *  method untuk menentukan kualitas dari hotel
     *
     *
     * @return    ke bintang (kualitas)
     */
    public int getBintang()
    {
        // put your code here
        return bintang;
    }

    /**
     *  method untuk menentukan id
     *
     *
     * @param     id (identitas)
     */
    public void setID(int id)
    {
        this.id = id;
    }

    /**
     *  method menentukan nama dalam hotel
     *
     * @param   nama
     *
     */
    public void setNama(String nama)
    {

        this.nama = nama;
    }

    /**
     *method untuk menentukan lokasi hotel
     *
     * @param  lokasi
     *
     */
    public void setLokasi(Lokasi lokasi)

    {
        this.lokasi = lokasi;
    }

    /**
     *method untuk menentukan kualitas hotel
     *
     * @param  bintang
     *
     */
    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }

    public int getId() {
        return id;
    }
}
