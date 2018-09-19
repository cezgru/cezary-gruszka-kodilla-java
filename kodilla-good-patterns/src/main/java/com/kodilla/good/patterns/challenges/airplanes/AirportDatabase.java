package com.kodilla.good.patterns.challenges.airplanes;

import java.util.ArrayList;
import java.util.List;

public class AirportDatabase {
    private static final List<Airport> airports = new ArrayList<>();


    public static List<Airport> getAirports() {
        return airports;
    }
}
