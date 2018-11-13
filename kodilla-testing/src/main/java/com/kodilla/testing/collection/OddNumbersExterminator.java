package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){

        for(Integer loop: numbers){
            if(loop % 2 == 0){
                evenNumbers.add(loop);
            }

        }

        return evenNumbers;
    }


}
