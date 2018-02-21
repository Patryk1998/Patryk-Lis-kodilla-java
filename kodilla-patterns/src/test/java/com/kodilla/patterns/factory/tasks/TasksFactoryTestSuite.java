package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;
import sun.misc.ASCIICaseInsensitiveComparator;

public class TasksFactoryTestSuite {

    @Test
    public void testShoppingTask() {
        //Given
        TasksFactory tasksFactory = new TasksFactory();
        Tasks task = tasksFactory.getTask(TasksFactory.SHOPPINGTASK);
        //When
        task.executeTask();
        //Then
        Assert.assertEquals("Go to greengrocer!", task.getTaskName());
        Assert.assertEquals(true, task.isTaskExecuted());
    }

    @Test
    public void testDrivingTest() {
        //Given
        TasksFactory tasksFactory = new TasksFactory();
        Tasks task = tasksFactory.getTask(TasksFactory.DRIVINGTASK);
        //When
        task.executeTask();
        //Then
        Assert.assertEquals("Drive to home!", task.getTaskName());
        Assert.assertEquals(true, task.isTaskExecuted());
    }

    @Test
    public void testPaintingTest() {
        //Given
        TasksFactory tasksFactory = new TasksFactory();
        Tasks task = tasksFactory.getTask(TasksFactory.PAINTINGTASK);
        //When
        task.executeTask();
        //Then
        Assert.assertEquals("Paint room!", task.getTaskName());
        Assert.assertEquals(true, task.isTaskExecuted());
    }
}
