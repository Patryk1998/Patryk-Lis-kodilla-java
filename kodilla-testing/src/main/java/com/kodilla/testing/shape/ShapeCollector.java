package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> shapes = new ArrayList<Shape>();
     public void addFigure(Shape shape){
         shapes.add(shape);
     }
     public void removeFigure(Shape shape){
         shapes.remove(shape);

     }
     public Shape getFigure(int n){
         return shapes.get(n);

     }

    public String showFigures() {
        String result = ".";
        for(Shape shape: shapes){
            result += shape.getShapeName();
        }
        return result;

    }

    public int listSize(){
         return shapes.size();
    }

    public Shape getListElement(int n){
         return shapes.get(n);
    }

    public void removeListElemnt(Shape shape){
         shapes.remove(shape);
    }

    public boolean containElement(Shape shape){
         return shapes.contains(shape);
    }
}
