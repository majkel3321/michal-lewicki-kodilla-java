package com.kodilla.patterns.factory;

public class Rectangle implements Shape {

    final private String name;
    final private double width;
    final private double length;

    public Rectangle(final String name, final double width, final double length){
        this.name = name;
        this.width = width;
        this.length = length;
    }

    public String getName(){
        return name;
    }

    public double getArea(){
        return width * length;
    }

    public double getCircumference(){
        return 2 * width + 2 * length;
    }


}
