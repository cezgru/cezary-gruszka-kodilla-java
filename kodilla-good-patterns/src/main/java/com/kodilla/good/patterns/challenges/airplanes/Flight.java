package com.kodilla.good.patterns.challenges.airplanes;

import java.time.LocalTime;

public class Flight {
    private int ID;
    private LocalTime departureTime;
    private LocalTime arrivalTime;
    private String origin;
    private String destination;

    public Flight(int ID, LocalTime departureTime, LocalTime arrivalTime, Airport origin, Airport destination) {
        this.ID = ID;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.origin = origin.getName();
        this.destination = destination.getName();
        origin.departures.add(this);
        destination.arrivals.add(this);
    }

    public int getID() {
        return ID;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }
}
