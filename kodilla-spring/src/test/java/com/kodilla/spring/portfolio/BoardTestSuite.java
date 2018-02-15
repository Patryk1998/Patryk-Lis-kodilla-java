package com.kodilla.spring.portfolio;



import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");

        Board board = (Board) context.getBean("getBoard");
        board.toDoList.addTask("First task to do!");
        board.inProgressList.addTask("First task in progress!");
        board.doneList.addTask("First done task!");
        //Then
        Assert.assertEquals("First task to do!", board.toDoList.tasks.get(0));
        Assert.assertEquals("First task in progress!", board.inProgressList.tasks.get(0));
        Assert.assertEquals("First done task!", board.doneList.tasks.get(0));


    }
}
