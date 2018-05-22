package com.example.tsalsawinny.jhotel_android_tsalsabillawinnyj;

/**
 * java untuk room
 *
 * @author Tsalsabilla Winny Junika
 * @version 08-05-2018
 */


public class Room {
    private String roomNumber;
    private String statusKamar;
    private double dailyTariff;
    private String tipeKamar;

    /**
     * Constructor for objects of class Room
     */
    public Room(String roomNumber, String statusKamar, double dailyTariff, String tipeKamar)
    {
        // initialise instance variables
        this.roomNumber = roomNumber;
        this.statusKamar = statusKamar;
        this.dailyTariff = dailyTariff;
        this.tipeKamar = tipeKamar;
    }

    /**
     * Informasi untuk mendapatkan nomor kamar
     *
     *
     * @return    ke nomor dalam kamar
     */
    public String getRoomNumber()
    {
        return roomNumber;
    }

    /**
     * method untuk mengambil status kamar
     * @return status_kamar
     *
     */
    public String getStatusKamar()
    {
        return  statusKamar;
    }

    /**
     * method untuk melihat tarif pelanggan
     * @return dailyTariff
     */
    public double getDailyTariff()
    {
        return dailyTariff;
    }

    /**
     * method untuk mengatur data hotel pada kamar
     */
    public String getTipeKamar()
    {
        return tipeKamar;
    }

    /**
     * method untuk mengatur nomor kamar
     * @param roomNumber
     */
    public void setRoomNumber(String roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    /**
     * method untuk mengatur status kamar
     * @param statusKamar
     */
    public void setStatusKamar(String statusKamar)
    {
        this.statusKamar = statusKamar;
    }

    /**
     * method untuk mengatur harga kamar
     * @param dailyTariff
     */
    public void setDailyTariff(double dailyTariff)
    {

        this.dailyTariff = dailyTariff;
    }

    /**
     * method untuk mengatur tipe kamar
     * @param tipeKamar
     */
    public void setTipeKamar(String tipeKamar)
    {
        this.tipeKamar = tipeKamar;
    }
}
