package com.kodilla.testing.collection;
import org.junit.*;
import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite
{
    @Before
    public void before()
    {
        System.out.println("Collection test: begin");
    }
    @After
    public void after()
    {
        System.out.println("Collection test: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList()
    {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator test = new OddNumbersExterminator();
        //When
       ArrayList<Integer> finalEmptyList = test.exterminate(emptyList);
       //Then
            Assert.assertTrue(finalEmptyList.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList()
    {
        //Given
        ArrayList<Integer> normalList = new ArrayList<>();
        Random genenerator = new Random();
        for(int i=0; i<98; i++)
        {
            normalList.add(genenerator.nextInt(100));
        }
        normalList.add(77);
        normalList.add(42); //guarante for including both types of numbers
        OddNumbersExterminator test = new OddNumbersExterminator();
        //When
        ArrayList<Integer> finalNormalList = test.exterminate(normalList);
        int evenQuantity=0;
        for(Integer number: finalNormalList)
        {
            if(number%2==0)
            {
                evenQuantity++;
            }
        }
        //Then
        int finalNormalListSize = finalNormalList.size();
        Assert.assertEquals(finalNormalListSize, evenQuantity);
    }
}
