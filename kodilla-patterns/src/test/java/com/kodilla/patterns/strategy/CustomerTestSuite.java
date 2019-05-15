package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.ConservativePredictor;
import org.junit.Assert;
import org.junit.Test;

public class CustomerTestSuite {

    @Test
    public void testDefaultInvestingStrategies() {

        Customer thomas = new IndividualYoungCustomer("Thomas Anderson");
        Customer john = new IndividualCustomer("John Wick");
        Customer kodilla = new CorporateCustomer("Kodilla");

        String thomasShouldBuy = thomas.predict();
        String johnShouldBuy = john.predict();
        String kodillaShouldBuy = kodilla.predict();

        System.out.println("Thomas should " + thomasShouldBuy);
        System.out.println("John should " + johnShouldBuy);
        System.out.println("Kodilla should " + kodillaShouldBuy);

        Assert.assertEquals("[Aggressive predictor] Buy stock of XYZ", thomasShouldBuy);
        Assert.assertEquals("[Conservative predictor] Buy debentures of XYZ", johnShouldBuy);
        Assert.assertEquals("[Balanced predictor] Buy shared units of Fund XYZ", kodillaShouldBuy);

    }

    @Test
    public void testIndividualInvestingStrategy() {

        Customer thomas = new IndividualYoungCustomer("Thomas Anderson");

        String thomasShouldBuy = thomas.predict();
        System.out.println("Thomas should " + thomasShouldBuy);

        thomas.setBuyPredictor(new ConservativePredictor());

        thomasShouldBuy = thomas.predict();
        System.out.println("Thomas now should " + thomasShouldBuy);


        Assert.assertEquals("[Conservative predictor] Buy debentures of XYZ", thomasShouldBuy);
    }
}
