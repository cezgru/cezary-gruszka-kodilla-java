package com.kodilla.good.patterns.challenges.airplanes;

import java.util.List;
import java.util.stream.Collectors;

public class FlightFinderStream {
    public List<Flight> findArrivalsStream(Airport origin, Airport destination){

        return origin.getDepartures().stream()
                .filter(departure->departure.getDestination()==destination.getName())
                .collect(Collectors.toList());
    }
}
