package com.kodilla.good.patterns.challenges.airplanes;

public class AirportGenerator {
    public static void generateAirports(AirportDatabase airportDatabase){
        Airport Krakow = new Airport("Krakow", airportDatabase);
        Airport Wroclaw = new Airport("Wroclaw", airportDatabase);
        Airport Warsaw = new Airport("Warsaw", airportDatabase);
        Airport Frankfurt = new Airport("Frankfurt", airportDatabase);
        Airport Berlin = new Airport("Berlin", airportDatabase);
        Airport Brussels = new Airport("Brussels", airportDatabase);
        Airport London = new Airport("London", airportDatabase);
    }
}
