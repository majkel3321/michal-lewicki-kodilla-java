package com.kodilla.kodillapatterns2.observer.forum.homework;

import java.util.ArrayList;
import java.util.List;

public class Homework implements Observable{

    private List<Observer> observers;
    private List<String> exercises;
    private String name;

    public Homework(String name){
        observers = new ArrayList<>();
        exercises = new ArrayList<>();
        this.name = name;
    }

    public void addExercise(String exercise){
        exercises.add(exercise);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void notifyObserver(){
        for (Observer observer: observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public List<String> getExercises() {
        return exercises;
    }

    public String getName() {
        return name;
    }
}
