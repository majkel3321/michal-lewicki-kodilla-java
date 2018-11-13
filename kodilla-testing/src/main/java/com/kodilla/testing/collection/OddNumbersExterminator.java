package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {



    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){

        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        for(Integer loop: numbers){
            if(loop % 2 == 0){
                evenNumbers.add(loop);
            }

        }

        return evenNumbers;
    }


}
