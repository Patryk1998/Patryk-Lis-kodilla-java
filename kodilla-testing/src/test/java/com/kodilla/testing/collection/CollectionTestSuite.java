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
        normalList.add(77);
        normalList.add(42); //guarante for including both types of numbers
        OddNumbersExterminator test = new OddNumbersExterminator();
        //When
        ArrayList<Integer> finalNormalList = test.exterminate(normalList);
        ArrayList<Integer> resultList = new ArrayList<>();
        resultList.add(42);
        //Then
        Assert.assertEquals(resultList, finalNormalList);
    }
}
