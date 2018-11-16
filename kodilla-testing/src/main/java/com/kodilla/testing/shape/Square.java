package com.kodilla.testing.shape;

class Square implements Shape {

    private String name;
    private double field;

    public Square(String name, double field){
        this.name = name;
        this.field = field;
    }

    public String getShapeName(){
        return name;
    }

    public double getField(){
        return field;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", field=" + field +
                '}';
    }
}
