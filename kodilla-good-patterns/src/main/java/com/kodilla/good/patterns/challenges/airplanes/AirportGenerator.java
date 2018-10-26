package com.kodilla.good.patterns.challenges.airplanes;

public class AirportGenerator {
    public static void generateAirports(AirportDatabase airportDatabase){
        new Airport("Krakow", airportDatabase);
        new Airport("Wroclaw", airportDatabase);
        new Airport("Warsaw", airportDatabase);
        new Airport("Frankfurt", airportDatabase);
        new Airport("Berlin", airportDatabase);
        new Airport("Brussels", airportDatabase);
        new Airport("London", airportDatabase);
    }
}
