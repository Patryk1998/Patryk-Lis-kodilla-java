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
         Shape figure = null;
         if(n>=0 && n<shapes.size()){
             figure = shapes.get(n);
         }
         return figure;

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





    public boolean containElement(Shape shape){
         return shapes.contains(shape);
    }
}
