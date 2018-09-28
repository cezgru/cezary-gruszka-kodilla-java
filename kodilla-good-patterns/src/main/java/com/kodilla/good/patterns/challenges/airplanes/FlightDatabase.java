package com.kodilla.good.patterns.challenges.airplanes;


import java.util.HashSet;
import java.util.Set;

class FlightDatabase {
    final Set<Flight> flightSet = new HashSet<>();

    Set<Flight> getFlights() {
        return flightSet;
    }
}