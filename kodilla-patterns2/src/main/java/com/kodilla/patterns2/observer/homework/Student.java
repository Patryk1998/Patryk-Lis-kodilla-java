package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Student implements Observable {
    private String studentName;
    private Deque<String> homeworks;
    private List<Observer> observers;

    public Student(String studentName) {
        this.studentName = studentName;
        this.homeworks = new ArrayDeque<>();
        this.observers = new ArrayList<>();
    }

    public void addHomework(String homework) {
        homeworks.offer(homework);
        notifyObservers(homework);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(String homework) {
        for(Observer observer: observers) {
            observer.update(this, homework);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getStudentName() {
        return studentName;
    }
}
