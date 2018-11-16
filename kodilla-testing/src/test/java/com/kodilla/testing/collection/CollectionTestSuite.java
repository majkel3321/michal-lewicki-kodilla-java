package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test suite: begin");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Test suite: end");
    }

    @Before
    public void before(){
        System.out.println("Test case: begin");
    }

    @After
    public void after(){
        System.out.println("Test case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        List<Integer> testList = new ArrayList<>();
        List<Integer> emptyList = new ArrayList<>();

        List<Integer> result = exterminator.exterminate(testList);
        System.out.println("Testing " + result);

        Assert.assertEquals(emptyList,result);

    }

    @Test
    public void testOddNumbersExterminatorNormalList(){

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        List<Integer> theList = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            theList.add(i);
        }

        List<Integer> evenList = Arrays.asList(2,4,6,8,10);


        List<Integer> result = exterminator.exterminate(theList);
        System.out.println("Testing " + result);

        Assert.assertEquals(evenList,result);


    }
}
