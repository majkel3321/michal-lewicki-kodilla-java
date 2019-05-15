package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {


    @Test
    public void testAddShape() {
        ShapeCollector shape = new ShapeCollector();
        Square square = new Square("square", 22.33);

        shape.addFigure(square);

        Assert.assertEquals(1, shape.getListQuantity());

    }

    @Test
    public void testRemoveShape() {
        ShapeCollector shape = new ShapeCollector();
        Square square = new Square("square", 12.22);
        Circle circle = new Circle("circle", 52.12);
        shape.addFigure(square);
        shape.addFigure(circle);

        shape.removeFigure(square);

        Assert.assertEquals(1, shape.getListQuantity());
    }

    @Test
    public void testGetFigureIndexTooSmall() {
        ShapeCollector shape = new ShapeCollector();
        Square square = new Square("Square", 41.11);
        shape.addFigure(square);

        Assert.assertEquals(null, shape.getFigure(-1));
    }

    @Test
    public void testGetFigureIndexTooBig() {
        ShapeCollector shape = new ShapeCollector();
        Square square = new Square("Square", 66.6);

        shape.addFigure(square);

        Assert.assertEquals(null, shape.getFigure(2));
    }

    @Test
    public void testGetFigure() {
        ShapeCollector shape = new ShapeCollector();
        Square square = new Square("Square", 71.14);

        shape.addFigure(square);

        Assert.assertEquals(square, shape.getFigure(0));

    }

    @Test
    public void testShowFigures() {
        ShapeCollector shape = new ShapeCollector();
        Square square = new Square("Square", 14.87);
        Circle circle = new Circle("Circle", 21.47);
        Triangle triangle = new Triangle("Triangle", 73.22);

        shape.addFigure(square);
        shape.addFigure(circle);
        shape.addFigure(triangle);

        List<Shape> expectedList = new ArrayList<>();
        expectedList.add(square);
        expectedList.add(circle);
        expectedList.add(triangle);

        Assert.assertEquals(expectedList, shape.showFigures());
    }


}
