package com.kodilla.good.patterns.challenges.airplanes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AirportDatabase {
    final Set<Airport> airports = new HashSet<>();


    public Set<Airport> getAirports() {
        return airports;
    }
}
