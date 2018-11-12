package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.Calculator.Calculator;

public class TestingMain {
    public static void main(String[]args){

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if(result.equals("theForimUser")){
            System.out.println("test OK");
        }
        else{
            System.out.println("Error!");
        }




        System.out.println("Pierwszy test jednostkowy");

        Calculator calculator = new Calculator(5,4);

        int addResult = calculator.add();

        int subtractResult = calculator.subtract();

        if(addResult == 9){
            System.out.println("Addition test OK");
        }
        else{
            System.out.println("Addition test Error ");
        }

        if(subtractResult == 1){
            System.out.println("Subtraction test OK ");
        }
        else{
            System.out.println("Subtraction test Error");
        }


    }
}
