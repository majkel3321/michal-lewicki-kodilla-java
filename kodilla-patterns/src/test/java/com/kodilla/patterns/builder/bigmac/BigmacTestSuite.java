package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacBuilder() {

        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("standard")
                .burgers(2)
                .sauce("hot")
                .ingredient("tomato")
                .ingredient("onion")
                .ingredient("paprika")
                .build();

        System.out.println(bigmac);

        int howManyIngredients = bigmac.getIngredients().size();
        String sauce = bigmac.getSauce();

        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals("hot", sauce);
    }
}
