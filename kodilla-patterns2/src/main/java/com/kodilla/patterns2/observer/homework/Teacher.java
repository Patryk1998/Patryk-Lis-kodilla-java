package com.kodilla.patterns2.observer.homework;

public class Teacher implements Observer {
    private String name;
    private int homeworkCounter;

    public Teacher(String name) {
        this.name = name;
    }


    @Override
    public void update(Student student, String homework) {
        System.out.println(name + ": homework: " + homework + "\n" +
        "student name: " + student.getStudentName());
        homeworkCounter++;
    }

    public int getHomeworkCounter() {
        return homeworkCounter;
    }
}
