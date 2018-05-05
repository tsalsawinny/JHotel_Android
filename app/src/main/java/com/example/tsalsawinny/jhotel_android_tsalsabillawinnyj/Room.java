package com.example.tsalsawinny.jhotel_android_tsalsabillawinnyj;

public class Room {
    private String roomNumber;
    private String statusKamar;
    private double dailyTariff;
    private String tipeKamar;

    public Room(String roomNumber, String statusKamar, double dailyTariff, String tipeKamar)
    {
        // initialise instance variables
        this.roomNumber = roomNumber;
        this.statusKamar = statusKamar;
        this.dailyTariff = dailyTariff;
        this.tipeKamar = tipeKamar;
    }

    public String getRoomNumber()
    {
        return roomNumber;
    }

    public String getStatusKamar()
    {
        return  statusKamar;
    }

    public double getDailyTariff()
    {
        return dailyTariff;
    }

    public String getTipeKamar()
    {
        return tipeKamar;
    }

    public void setRoomNumber(String roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    public void setStatusKamar(String statusKamar)
    {
        this.statusKamar = statusKamar;
    }

    public void setDailyTariff(double dailyTariff)
    {

        this.dailyTariff = dailyTariff;
    }

    public void setTipeKamar(String tipeKamar)
    {
        this.tipeKamar = tipeKamar;
    }
}
