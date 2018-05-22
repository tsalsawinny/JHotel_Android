package com.example.tsalsawinny.jhotel_android_tsalsabillawinnyj;

/**
 * java untuk menentukan lokasi
 *
 * @author Tsalsabilla Winny Junika
 * @version 08-05-2018
 */


public class Lokasi {
    private double x_coord;
    private double y_coord;
    private String deskripsi;

    /**
     * Constructor for objects of class Lokasi
     */
    public Lokasi(double x_coord, double y_coord, String deskripsi)
    {
        // initialise instance variables
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsi = deskripsi;
    }

    /**
     * method mendapatkan lokasi hotel pada koordinat x
     *
     *
     * @return  kordinat X
     */
    public double getX()
    {
        // put your code here
        return x_coord;
    }


    /**
     * method mendapatkan lokasi hotel pada koordinat Y
     *
     *
     * @return   koordinat Y
     */
    public double getY()
    {
        return y_coord;
    }

    /**
     * method info selengkapnya hotel
     *
     *
     * @return    deskripsi lokasi hotel
     */
    public String getDeskripsi()
    {
        return deskripsi;
    }

    /**
     *  method - replace this comment with your own
     *
     * @param  x_coord X
     *
     */
    public void setX (float x_coord)
    {
        this.x_coord = x_coord;
    }


    /**
     *  method untuk menentukan lokasi hotel dikoordinat Y
     *
     * @param  y_coord Y
     *
     */
    public void setY (float y_coord)
    {
        this.y_coord = y_coord;
    }

    /**
     * method menampilkan deskripsi hotel
     *
     * @param  deskripsi  Hotel nya
     *
     */
    public void setDeskripsi (String deskripsi)
    {
        deskripsi = deskripsi;
    }
}
