package com.kodilla.exception.test;

public class FlightFinder {
    public static void findFlight(Flight flight) throws RouteNotFoundException{

        if(!AirportList.getAirportList().containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        }
        if(AirportList.getAirportList().get(flight.getArrivalAirport()))
            System.out.println("Route found");
        else
            System.out.println("No route found");
    }
}
