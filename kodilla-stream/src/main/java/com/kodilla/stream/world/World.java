package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class World {

    private List<Continent> continents = new ArrayList<>();

   public void addContinent(Continent continent){
       continents.add(continent);
   }

   public BigDecimal getPeopleQuantity(){

       return continents.stream()
               .map(Continent::getCountries)
               .flatMap(List::stream)
               .map(Country::getPeopleQuantity)
               .reduce(BigDecimal.ZERO,BigDecimal::add);


   }



}
