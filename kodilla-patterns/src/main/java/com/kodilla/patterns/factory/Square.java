package com.kodilla.patterns.factory;

public class Square implements Shape {

    final private String name;
    final private double width;

    public Square(final String name, final double width) {
        this.name = name;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return Math.pow(width, 2.0);
    }

    public double getCircumference() {
        return width * 4;
    }


}
