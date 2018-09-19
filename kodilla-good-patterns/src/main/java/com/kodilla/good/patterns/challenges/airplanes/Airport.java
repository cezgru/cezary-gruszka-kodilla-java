package com.kodilla.good.patterns.challenges.airplanes;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    //Could also be protected but apparently no modifier means access is restricted to this package so yeah
    List<Flight> arrivals = new ArrayList<>();
    List<Flight> departures = new ArrayList<>();
    private String name;

    public List<Flight> getArrivals() {
        return arrivals;
    }

    public List<Flight> getDepartures() {
        return departures;
    }

    public String getName() {
        return name;
    }

    public Airport(String name) {
        this.name = name;
    }

    public Airport getAirportByName(String name){
        return this;
    }
}
