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
        int exampleArray[] = new int[20];
       exampleArray[0] = 5;
       exampleArray[1] = 5;
       exampleArray[2] = 5;
       exampleArray[3] = 5;
       exampleArray[4] = 5;
       exampleArray[5] = 5;
       exampleArray[6] = 5;
       exampleArray[7] = 5;
       exampleArray[8] = 5;
       exampleArray[9] = 5;
       exampleArray[10] = 10;
       exampleArray[11] = 10;
       exampleArray[12] = 10;
       exampleArray[13] = 10;
       exampleArray[14] = 10;
       exampleArray[15] = 10;
       exampleArray[16] = 10;
       exampleArray[17] = 10;
       exampleArray[18] = 10;
       exampleArray[19] = 10;
        //When
        ArrayOperations average = new Average();
        average.getAverage(exampleArray);
       double av = average.getAverage(exampleArray);
       //Then
       Assert.assertEquals(7.5, av, 0);



    }
}
