package com.kodilla.patterns2.observer.homework;

public interface Observable {
    void registerObserver(Observer observer);
    void notifyObservers(String homework);
    void removeObserver(Observer observer);
}
