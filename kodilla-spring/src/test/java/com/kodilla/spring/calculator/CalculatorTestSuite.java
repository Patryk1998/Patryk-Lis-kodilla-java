package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //When
        Calculator calculator = (Calculator) context.getBean("calculator");
        //Then
        Assert.assertEquals(9, calculator.add(5,4), 0);
        Assert.assertEquals(1, calculator.sub(5,4), 0);
        Assert.assertEquals(20, calculator.mul(5,4), 0);
        Assert.assertEquals(5, calculator.div(20,4), 0);
    }

}
