package com.example.uberapptim24.model;

public class Ride {
    private String driver;
    private String passenger;
    private String startLocation;
    private String endLocation;
    private int rideLength;

    public Ride(String driver, String passenger, String startLocation, String endLocation, int rideLength) {
        this.driver = driver;
        this.passenger = passenger;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.rideLength = rideLength;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getPassenger() {
        return passenger;
    }

    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public int getRideLength() {
        return rideLength;
    }

    public void setRideLength(int rideLength) {
        this.rideLength = rideLength;
    }
}
