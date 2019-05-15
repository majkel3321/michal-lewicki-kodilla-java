package com.kodilla.kodillapatterns2.decorator.taxiportal;

import org.junit.Test;

import java.math.BigDecimal;
import static org.junit.Assert.*;

public class TaxiOrderTestSuite {

    @Test
    public void testBasicTaxiOrderGetCost(){
        //Given
        TaxiOrder basicTaxiOrder = new BasicTaxiOrder();
        //When
        BigDecimal calculatedCost = basicTaxiOrder.getCost();
        //Then
        assertEquals(new BigDecimal(5),calculatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription(){
        //Given
        TaxiOrder basicTaxiOrder = new BasicTaxiOrder();
        //When
        String description = basicTaxiOrder.getDescription();
        //Then
        assertEquals("Drive a course",description);
    }

    @Test
    public void testTaxiNetworkGetCost(){
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(40),theCost);
    }

    @Test
    public void testTaxiNetworkGetDescription(){
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //When
        String theDescription = theOrder.getDescription();
        //Then
        assertEquals("Drive a course by Taxi Network",theDescription);
    }

    @Test
    public void testMyTaxiWithChildSeatCost(){
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //Then
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(27),theCost);
    }

    @Test
    public void testMyTaxiWithChildSeatDescription(){
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //When
        String theDescription = theOrder.getDescription();
        //Then
        assertEquals("Drive a course by MyTaxi Network + child seat",theDescription);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetCost(){
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipDecorator(theOrder);
        theOrder = new ExpressDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //When
        assertEquals(new BigDecimal(57),theCost);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription(){
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipDecorator(theOrder);
        theOrder = new ExpressDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //When
        String theDescription = theOrder.getDescription();
        System.out.println(theDescription);
        //Then
        assertEquals("Drive a course by Taxi Network + variant VIP + express service + child seat",theDescription);
    }
}
