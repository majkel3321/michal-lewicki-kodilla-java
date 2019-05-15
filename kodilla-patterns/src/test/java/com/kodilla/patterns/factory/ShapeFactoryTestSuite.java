package com.kodilla.patterns.factory;

import org.junit.Assert;
import org.junit.Test;

public class ShapeFactoryTestSuite {

    @Test
    public void testFactoryCircle() {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.makeShape(ShapeFactory.CIRCLE);

        Assert.assertEquals(2 * Math.PI * 4.5, circle.getCircumference(), 0);
        Assert.assertEquals("The rounded circle", circle.getName());

    }

    @Test
    public void testFactorySquare() {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape square = shapeFactory.makeShape(ShapeFactory.SQUARE);

        Assert.assertEquals(5 * 5, square.getArea(), 0);
        Assert.assertEquals("The angular square", square.getName());

    }

    @Test
    public void testFactoryRectangle() {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.makeShape(ShapeFactory.RECTANGLE);

        Assert.assertEquals(2 * 8, rectangle.getArea(), 0);
        Assert.assertEquals("The long rectangle", rectangle.getName());
    }
}
