package com.kodilla.good.patterns.challenges.airplanes;

public class Application {
    public static void main(String[] args) {
        AirportDatabase airportDatabase = new AirportDatabase();
        AirportGenerator.generateAirports(airportDatabase);
        Airport Paris = new Airport("Paris", airportDatabase);
        Airport Madrid = new Airport("Madrid", airportDatabase);

        FlightDatabase flightDatabase = new FlightDatabase();

        FlightGenerator.generateFlights(flightDatabase, airportDatabase);

        for (Object f: FlightFinderStream.findConnection(Paris, Madrid, flightDatabase)
             ) {
            System.out.println(f);
        }
    }
}
