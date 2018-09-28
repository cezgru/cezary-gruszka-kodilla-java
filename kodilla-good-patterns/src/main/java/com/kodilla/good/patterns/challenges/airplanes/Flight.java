package com.kodilla.good.patterns.challenges.airplanes;

import java.time.LocalTime;

public class Flight {
    private int ID;
    private Airport origin;
    private Airport destination;

    public Flight(int ID, Airport origin, Airport destination, FlightDatabase flightDatabase) {
        this.ID = ID;

        this.origin = origin;
        this.destination = destination;
        origin.departures.add(this);
        destination.arrivals.add(this);
        flightDatabase.flightSet.add(this);
    }

    public int getID() {
        return ID;
    }


    public Airport getOrigin() {
        return origin;
    }

    public Airport getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "ID=" + ID +
                ", origin=" + origin.getName() +
                ", destination=" + destination.getName() +
                '}';
    }
}
