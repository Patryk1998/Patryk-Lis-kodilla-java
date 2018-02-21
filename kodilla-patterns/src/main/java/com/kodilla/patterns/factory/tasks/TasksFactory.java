package com.kodilla.patterns.factory.tasks;

public final class TasksFactory {
    final static String SHOPPINGTASK = "Shopping Task";
    final static String PAINTINGTASK = "Painting Task";
    final static String DRIVINGTASK = "Driving Task";

    public final Tasks getTask(final String task) {
        switch (task) {
            case SHOPPINGTASK:
                return new ShoppingTask("Go to greengrocer!", "carrot", 7);
            case PAINTINGTASK:
                return new PaintingTask("Paint room!", "blue", "wall");
            case DRIVINGTASK:
                return new DrivingTask("Drive to home!", "home", "car");
            default:
                return null;
        }
    }
}
