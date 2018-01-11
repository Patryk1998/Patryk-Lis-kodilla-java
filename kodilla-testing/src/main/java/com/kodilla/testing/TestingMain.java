package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //calculator test

        Calculator test = new Calculator();
        int a=11, b=6;
        int additionResult = test.add(a,b);
        int subtractionResult = test.subtract(a,b);

        if(additionResult==a+b && subtractionResult==a-b)
        {
            System.out.println("test OK");
        } else System.out.println("Something is wrong!");

    }
}
