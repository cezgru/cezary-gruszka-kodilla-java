package com.kodilla.good.patterns.challenges.airplanes;

import java.util.*;

public class Airport {
    //Could also be protected but apparently no modifier means access is restricted to this package so yeah
    final Set<Flight> arrivals = new HashSet<>();
    final Set<Flight> departures = new HashSet<>();
    private String name;

    public Set<Flight> getArrivals() {
        return arrivals;
    }

    public Set<Flight> getDepartures() {
        return departures;
    }

    public String getName() {
        return name;
    }

    public Airport(String name, AirportDatabase airportDatabase) {
        this.name = name;
        airportDatabase.airports.add(this);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(name, airport.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + name + '\'' +
                '}';
    }
}
