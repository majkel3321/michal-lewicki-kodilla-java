package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

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

        ArrayList<Integer> testList = new ArrayList<>();
        ArrayList<Integer> emptyList = new ArrayList<>();

        ArrayList<Integer> result = exterminator.exterminate(testList);
        System.out.println("Testing " + result);

        Assert.assertEquals(emptyList,result);

    }

    @Test
    public void testOddNumbersExterminatorNormalList(){

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        ArrayList<Integer> theList = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            theList.add(i);
        }

        ArrayList<Integer> evenList = new ArrayList<>();

        evenList.add(2);
        evenList.add(4);
        evenList.add(6);
        evenList.add(8);
        evenList.add(10);

        ArrayList<Integer> result = exterminator.exterminate(theList);
        System.out.println("Testing " + result);

        Assert.assertEquals(evenList,result);


    }
}
