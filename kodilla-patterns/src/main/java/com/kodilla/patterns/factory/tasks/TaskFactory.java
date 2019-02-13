package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOP = "SHOP";
    public static final String DRIVE = "DRIVE";
    public static final String PAINT = "PAINT";

    public Task createTask(String task){

        switch (task){
            case SHOP:
                return new ShoppingTask("Shop","Candies",10);
            case DRIVE:
                return new DrivingTask("Drive","Atlanta","Car");
            case PAINT:
                return new PaintingTask("Paint","Dog","Black");

            default:
                return null;
        }
    }

}
