package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    @Qualifier("1")
    TaskList toDoList;

    @Qualifier("2")
    TaskList inProgressList;

    @Qualifier("3")
    TaskList doneList;

    @Bean
    public Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "1")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean(name = "2")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean(name = "3")
    public TaskList getDoneList() {
        return new TaskList();
    }

    //Testy nie wychodzą, pisałeś żeby beany powiązać za pomocą adnotacji. Jeżeli nie tak, to jak?
}
