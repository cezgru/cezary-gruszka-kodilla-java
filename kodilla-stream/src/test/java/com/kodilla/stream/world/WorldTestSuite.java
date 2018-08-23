package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World Earth = new World();

        Continent Europe = new Continent();
        Continent Asia = new Continent();
        Continent Africa = new Continent();

        Country Poland = new Country(new BigDecimal("38095222"));
        Country Germany = new Country(new BigDecimal("82319665"));
        Country France = new Country(new BigDecimal("65270406"));
        Country China = new Country(new BigDecimal("1415855115"));
        Country India = new Country(new BigDecimal("1356237466"));
        Country SouthKorea = new Country(new BigDecimal("51191101"));
        Country Egypt = new Country(new BigDecimal("99644745"));
        Country SouthAfrica = new Country(new BigDecimal("57498495"));

        Europe.addCountry(Poland);
        Europe.addCountry(Germany);
        Europe.addCountry(France);
        Asia.addCountry(China);
        Asia.addCountry(India);
        Asia.addCountry(SouthKorea);
        Africa.addCountry(Egypt);
        Africa.addCountry(SouthAfrica);

        Earth.addContinent(Europe);
        Earth.addContinent(Africa);
        Earth.addContinent(Asia);



        //When
        BigDecimal result = Earth.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("3166112215"), result);
    }


}
