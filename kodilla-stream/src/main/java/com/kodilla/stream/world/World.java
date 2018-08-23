package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<Continent> continents = new ArrayList<>();

    public void addContinent(Continent c){
        continents.add(c);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal people = continents.stream()
                .map(continent -> continent.getCountries())
                .flatMap(countries -> countries.stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (current, sum) -> sum.add(current));

        return people;
    }
}
