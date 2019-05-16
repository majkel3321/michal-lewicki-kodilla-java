package com.kodilla.kodillapatterns2.observer.forum.homework;

public class Teacher implements Observer {

    private String name;
    private int exerciseCount;

    public Teacher(String name){
        this.name = name;
    }

    @Override
    public void update(Homework homework){
        System.out.println(name + ": New homework to check of student " + homework.getName() +
                "\nTotal homeworks to check: " + homework.getExercises().size());
        exerciseCount++;
    }

    public String getName() {
        return name;
    }

    public int getExerciseCount() {
        return exerciseCount;
    }
}
