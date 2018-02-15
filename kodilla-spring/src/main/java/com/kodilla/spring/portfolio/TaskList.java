package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public final class TaskList {
    final List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public String getTask(int number) {
        return tasks.get(number);
    }
}
