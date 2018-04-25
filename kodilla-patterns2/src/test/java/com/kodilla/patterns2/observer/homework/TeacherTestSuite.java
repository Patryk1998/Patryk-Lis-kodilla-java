package com.kodilla.patterns2.observer.homework;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TeacherTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Student student1 = new Student("student1");
        Student student2 = new Student("student2");
        Student student3 = new Student("student3");
        Student student4 = new Student("student4");
        Student student5 = new Student("student5");
        Student student6 = new Student("student6");
        Student student7 = new Student("student7");
        Student student8 = new Student("student8");
        Student student9 = new Student("student9");
        Student student10 = new Student("student10");
        Teacher teacher1 = new Teacher("teacher1");
        Teacher teacher2 = new Teacher("teacher2");
        student1.registerObserver(teacher1);
        student2.registerObserver(teacher1);
        student3.registerObserver(teacher1);
        student4.registerObserver(teacher2);
        student5.registerObserver(teacher2);
        student6.registerObserver(teacher2);
        student7.registerObserver(teacher2);
        student8.registerObserver(teacher2);
        student9.registerObserver(teacher2);
        student10.registerObserver(teacher2);
        //When
        student1.addHomework("homework1");
        student2.addHomework("homework2");
        student3.addHomework("homework3");
        student4.addHomework("homework4");
        student5.addHomework("homework5");
        student6.addHomework("homework6");
        student7.addHomework("homework7");
        student8.addHomework("homework8");
        student9.addHomework("homework9");
        student10.addHomework("homework10");
        //Then
        assertEquals(3, teacher1.getHomeworkCounter());
        assertEquals(7, teacher2.getHomeworkCounter());





    }
}
