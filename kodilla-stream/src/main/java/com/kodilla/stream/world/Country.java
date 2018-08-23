package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    final BigDecimal people;

    public Country(BigDecimal people) {
        this.people = people;
    }

    public BigDecimal getPeopleQuantity(){
        return people;
    }
}
