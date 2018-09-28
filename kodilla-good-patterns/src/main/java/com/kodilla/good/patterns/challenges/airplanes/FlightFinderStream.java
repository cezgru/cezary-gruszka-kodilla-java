package com.kodilla.good.patterns.challenges.airplanes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinderStream {
    public static List<Flight> findDepartures(Airport airport, FlightDatabase flightDatabase) {

        return flightDatabase.getFlights().stream()
                .filter(x -> x.getOrigin().equals(airport))
                .collect(Collectors.toList());
    }

    public static List<Flight> findArrivals(Airport airport, FlightDatabase flightDatabase) {

        return flightDatabase.getFlights().stream()
                .filter(x -> x.getDestination().equals(airport))
                .collect(Collectors.toList());
    }


    public static List<Object> findConnection(Airport origin, Airport destination, FlightDatabase flightDatabase) {

        List<Flight> directFlight = flightDatabase.getFlights().stream()
                .filter(x -> (x.getOrigin().equals(origin) && x.getDestination().equals(destination)))
                .collect(Collectors.toList());


        List<Flight> connectingFlightFromOrigin = flightDatabase.getFlights().stream()
                .filter(x -> x.getOrigin().equals(origin) && !(x.getDestination().equals(destination)
                && !(x.getDestination().equals(origin))))
                .collect(Collectors.toList());

        //connectingFlightFromOrigin.stream()
                //.collect(Collectors.toList(x-> ConnectingFlight.connectFlights(x, x.getDestination())));
        List<ConnectingFlight> list = new ArrayList<>();
        for (Flight f: connectingFlightFromOrigin
             ) {
             list.addAll(ConnectingFlight.connectFlights(f, destination));
        }


        List<Object> result = new ArrayList<>();
        result.addAll(directFlight);
        result.addAll(list);

        return result;
    }
}
