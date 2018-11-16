package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {



    public List<Integer> exterminate(List<Integer> numbers){

        List<Integer> evenNumbers = new ArrayList<Integer>();

        for(Integer loop: numbers){
            if(loop % 2 == 0){
                evenNumbers.add(loop);
            }

        }

        return evenNumbers;
    }


}
