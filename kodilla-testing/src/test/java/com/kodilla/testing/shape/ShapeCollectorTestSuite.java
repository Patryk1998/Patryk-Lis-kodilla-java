package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {

    @Test //checking if anything add
    public void addFigureTestV1(){
        //Given
        ShapeCollector example = new ShapeCollector();
        Shape circle = new Circle(5.17);
        //When
        example.addFigure(circle);
        //Then
        Assert.assertEquals(1, example.listSize());
    }

    @Test //checking if added element = element in ArrayList
    public void addFigureTestV2(){
        //Given
        ShapeCollector example = new ShapeCollector();
        Shape square = new Square(7);
        //When
        example.addFigure(square);
        Shape test = example.getListElement(0);
        //Then
        Assert.assertEquals(square, test);
    }

    @Test
    public void removeFigureTest(){
        //Given
        ShapeCollector example = new ShapeCollector();
        Shape square = new Square(3);
        example.addFigure(square);
        //When
        example.removeListElemnt(square);
        //Then
        Assert.assertFalse(example.containElement(square));
    }
    @Test
    public void getFigureTest(){
        //Given
        ShapeCollector example = new ShapeCollector();
        Shape triangle = new Triangle(23, 12);
        example.addFigure(triangle);
        //When
        Shape test = example.getFigure(0);
        //Then
        Assert.assertEquals(triangle, test);
    }
    @Test
    public void showFiguresTest(){
        //Given
        ShapeCollector example = new ShapeCollector();
        Shape triangle = new Triangle(9,7.6);
        Shape square = new Square(4);
        Shape circle = new Circle(7);
        example.addFigure(triangle);
        example.addFigure(square);
        example.addFigure(circle);
        //When
        String showedFigures = ".TriangleSquareCircle";

        //Then
        Assert.assertEquals(example.showFigures(), showedFigures);
    }


}
