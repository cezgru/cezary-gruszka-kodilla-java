package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class AirportList {
 private static Map<String, Boolean> airportList = new HashMap<>();
    static{
        airportList.put("Krakow", true);
        airportList.put("Frankfurt", true);
        airportList.put("Helsinki", true);
        airportList.put("Smolensk", false);
        airportList.put("Beijin", false);
        airportList.put("Sydney", true);

    }

    public static Map<String, Boolean> getAirportList() {
        return airportList;
    }
}
