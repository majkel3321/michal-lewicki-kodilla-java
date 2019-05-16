package com.kodilla.kodillapatterns2.observer.forum.homework;

public interface Observable {
    void registerObserver(Observer observer);
    void notifyObserver();
    void removeObserver(Observer observer);
}
