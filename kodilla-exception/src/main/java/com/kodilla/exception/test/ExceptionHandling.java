package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args){

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyWillThrowException(3,11);

        }catch (Exception e){

            System.out.println("Something went wrong! Error: " + e);
        }
    }
}
