package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[]args){

        /*ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10,5,(a,b) -> a+b);
        expressionExecutor.executeExpression(10,5,(a,b) -> a-b);
        expressionExecutor.executeExpression(11,12,(a,b) -> a*b);
        expressionExecutor.executeExpression(11,4,(a,b) -> a/b);

        System.out.println("Calculation expressions with method references");
        expressionExecutor.executeExpression(5,6, FunctionalCalculator :: multiplyAByB);
        expressionExecutor.executeExpression(5,8, FunctionalCalculator :: addAToB);
        expressionExecutor.executeExpression(11,7, FunctionalCalculator :: substractBFromA);
        expressionExecutor.executeExpression(12,9, FunctionalCalculator :: divineAByB);*/


      /*  PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("lambda",(text) -> text.toUpperCase());
        poemBeautifier.beautify("lambda expression",(text) -> "..::" + text + "::..");
        poemBeautifier.beautify("lambda",(text) -> text.replaceFirst("l","L") );
        poemBeautifier.beautify("lambda",(text) -> text.length() + text + text.length());*/


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}
