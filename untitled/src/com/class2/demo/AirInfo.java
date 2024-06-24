package com.class2.demo;

public class AirInfo {
    private int id;
    private String  flight_number;
    private String destination;
    private String flight_date;

    public AirInfo() {
    }

    public AirInfo(int id, String flight_number, String destination, String flight_date) {
        this.id = id;
        this.flight_number = flight_number;
        this.destination = destination;
        this.flight_date = flight_date;
    }

    public int getId() {
        return id;
    }

    public String getFlight_number() {
        return flight_number;
    }

    public String getDestination() {
        return destination;
    }

    public String getFlight_date() {
        return flight_date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlight_date(String flight_date) {
        this.flight_date = flight_date;
    }
}
