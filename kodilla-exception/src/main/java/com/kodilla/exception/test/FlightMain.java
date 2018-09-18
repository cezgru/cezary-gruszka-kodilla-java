package com.kodilla.exception.test;

public class FlightMain {
    public static void main(String[] args) {
        Flight LH001 = new Flight("Krakow", "SDF");

        try{
            FlightFinder.findFlight(LH001);
        } catch(RouteNotFoundException e) {
            System.out.println("Such an airport does not exist in our database");
        }
    }
}
