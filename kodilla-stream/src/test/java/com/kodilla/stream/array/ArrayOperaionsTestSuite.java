package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayOperaionsTestSuite {

    @Test
    public void testGetAverage(){

        int[] tab = new int[20];

        for(int i = 0; i < 20; i++){
            tab[i] = i + 11;
        }

        Calculate calculate = new Calculate();

        double average = calculate.getAverage(tab);

        Assert.assertEquals(20.5,average,0.001);
    }
}
