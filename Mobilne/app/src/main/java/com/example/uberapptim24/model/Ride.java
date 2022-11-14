package com.example.uberapptim24.model;

public class Ride {
    private String startDateTime;
    private String endDateTime;
    private String driver;
    private String passenger;
    private String startLocation;
    private String endLocation;
    private int rideLength;
    private int rating;
    private String comment;
    private int id;

    public Ride(String driver, String passenger, String startLocation, String endLocation, int rideLength, String startTime, String endTime,int rating, String comment,int id) {
        this.driver = driver;
        this.passenger = passenger;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.rideLength = rideLength;
        this.startDateTime = startTime;
        this.endDateTime = endTime;
        this.rating = rating;
        this.comment = comment;
        this.id = id;
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

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getId() {
        return id;
    }
}
