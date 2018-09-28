package com.kodilla.good.patterns.challenges.airplanes;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class FlightGenerator {
    public static void generateFlights(FlightDatabase flightDatabase, AirportDatabase airportDatabase) {
        List<Airport> airports = new ArrayList<>(airportDatabase.getAirports());
        for (int i = 0; i < airports.size() * 28; i++) {
                new Flight(i, airports.get(ThreadLocalRandom.current().nextInt(airports.size())),
                        airports.get(ThreadLocalRandom.current().nextInt(airports.size())), flightDatabase);

        }
    }
}
