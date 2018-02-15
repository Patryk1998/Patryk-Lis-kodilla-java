package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("1")
    TaskList toDoList;

    @Autowired
    @Qualifier("2")
    TaskList inProgressList;

    @Autowired
    @Qualifier("3")
    TaskList doneList;

    @Bean
    public Board board() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "1")
    @Scope("prototype")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean(name = "2")
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean(name = "3")
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList();
    }

}


//@Configuration
//public class BoardConfig {
//
//    @Autowired
//    TaskList toDoList;
//
//    @Autowired
//    TaskList inProgressList;
//
//    @Autowired
//    TaskList doneList;
//
//    @Bean
//    public Board board() {
//        return new Board(toDoList, inProgressList, doneList);
//    }
//
//    @Bean
//    @Scope("prototype")
//    public TaskList taskList() {
//        return new TaskList();
//    }
//
//}
