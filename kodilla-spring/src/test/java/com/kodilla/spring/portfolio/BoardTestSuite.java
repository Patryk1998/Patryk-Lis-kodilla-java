package com.kodilla.spring.portfolio;



import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        Board board = (Board) context.getBean("board");

        board.toDoList.addTask("First task to do!");
        board.inProgressList.addTask("First task in progress!");
        board.doneList.addTask("First done task!");

        Assert.assertEquals("First task to do!", board.toDoList.getTask(0));
        Assert.assertEquals("First task in progress!", board.inProgressList.getTask(0));
        Assert.assertEquals("First done task!", board.doneList.getTask(0));


        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");

    }
}
