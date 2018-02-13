package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    TaskList toDoList = new TaskList();
    TaskList inProgressList = new TaskList();
    TaskList doneList = new TaskList();

    @Bean
    public Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }
}
