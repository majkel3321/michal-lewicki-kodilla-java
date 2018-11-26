package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){

        List<Country> europe = new ArrayList<>();
        List<Country> america = new ArrayList<>();

        Country poland = new Country(new BigDecimal("38000000"));
        Country germany = new Country(new BigDecimal("84000000"));

        Country usa = new Country(new BigDecimal("325000000"));
        Country canada = new Country(new BigDecimal("36000000"));

        europe.add(poland);
        europe.add(germany);

        america.add(usa);
        america.add(canada);

        Continent continent1 = new Continent(europe);
        Continent continent2 = new Continent(america);

        World world = new World();

        world.addContinent(continent1);
        world.addContinent(continent2);


        BigDecimal expectedPopulation = new BigDecimal("483000000");

        Assert.assertEquals(expectedPopulation,world.getPeopleQuantity());

















    }
}
