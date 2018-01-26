package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;
import stream.array.ArrayOperations;
import stream.array.Average;

import java.util.OptionalDouble;
import java.util.Random;

public class ArrayOperationsTestSuite {
   @Test
    public void testGetAverage(){
        //Given
        Random generator = new Random();
        int exampleArray[] = new int[20];
        for(int i=0; i<20; i++){
            exampleArray[i] = generator.nextInt(100);
        }
        double sum = 0;
        for(int i=0; i<20; i++){
            sum += exampleArray[i];
        }
        double averageTest = sum/20;
        //When
        ArrayOperations average = new Average();
        average.getAverage(exampleArray);
       double av = average.getAverage(exampleArray);
       //Then
       Assert.assertEquals(averageTest, av, 0);



    }
}
