package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Tasks {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean ifDone;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        ifDone = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return ifDone;
    }
}
