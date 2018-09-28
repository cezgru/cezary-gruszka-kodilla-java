package com.kodilla.good.patterns.challenges.airplanes;

import java.util.List;
import java.util.stream.Collectors;

public class ConnectingFlight{
    Flight flight1;
    Flight flight2;

    public ConnectingFlight(Flight flight1, Flight flight2) {
        this.flight1 = flight1;
        this.flight2 = flight2;
    }


    public static List<ConnectingFlight> connectFlights(Flight flight, Airport destination){
        return flight.getDestination().getDepartures().stream()
                .filter(x -> x.getDestination().equals(destination))
                .map(x -> new ConnectingFlight(flight, x))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "ConnectingFlight{" +
                "First flight = " + flight1 +
                ", Second flight = " + flight2 +
                '}';
    }
}
