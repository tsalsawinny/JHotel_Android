package com.example.tsalsawinny.jhotel_android_tsalsabillawinnyj;

public class Lokasi {
    private double x_coord;
    private double y_coord;
    private String deskripsi;

    public Lokasi(double x_coord, double y_coord, String deskripsi)
    {
        // initialise instance variables
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsi = deskripsi;
    }

    public double getX()
    {
        // put your code here
        return x_coord;
    }


    public double getY()
    {
        return y_coord;
    }

    public String getDeskripsi()
    {
        return deskripsi;
    }


    public void setX (float x_coord)
    {
        this.x_coord = x_coord;
    }


    public void setY (float y_coord)
    {
        this.y_coord = y_coord;
    }


    public void setDeskripsi (String deskripsi)
    {
        deskripsi = deskripsi;
    }
}
