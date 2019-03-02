package com.kodilla.patterns.factory;

public final class ShapeFactory {

    public static final String CIRCLE = "CIRCLE";
    public static final String SQUARE = "SQUARE";
    public static final String RECTANGLE = "RECTANGLE";

    public final Shape makeShape(final String shapeClass){

        switch (shapeClass){
            case CIRCLE :
                return new Circle("The rounded circle",4.5);

            case SQUARE:
                return new Square("The angular square",5);

            case RECTANGLE:
                return new Rectangle("The long rectangle",2,8);

            default:
                return null;

        }
    }


}