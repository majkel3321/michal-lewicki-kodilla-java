package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {


    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public void removeFigure(Shape shape){
        shapes.remove(shape);
    }

    public Shape getFigure(int n) {

        if (n >= 0 && n < shapes.size()){
            return shapes.get(n);
        }

        else
            return null;


    }

   public List<Shape> showFigures(){

       return shapes;
   }


    public int getListQuantity(){
        return shapes.size();
    }




}
