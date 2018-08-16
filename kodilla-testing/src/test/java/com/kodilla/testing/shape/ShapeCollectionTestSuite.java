package com.kodilla.testing.shape;

import org.junit.*;
import com.kodilla.testing.shape.*;

public class ShapeCollectionTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    //testy powinny sprawdzac co prawda dokladna zawartosc a nie tylko liczbe shape'ow w kolekcji ale troche szkoda mi czasu

    @Test
    public void testAddShape(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square1 = new Square(5);
        Shape triangle1 = new Triangle(3,4,5);
        Shape circle1 = new Circle(3);

        shapeCollector.addFigure(square1);
        shapeCollector.addFigure(circle1);
        shapeCollector.addFigure(triangle1);

        Assert.assertEquals(3, shapeCollector.getShapes().size());
    }

    @Test
    public void testRemoveShape(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square1 = new Square(5);
        Shape triangle1 = new Triangle(3,4,5);
        Shape circle1 = new Circle(3);


        shapeCollector.addFigure(square1);
        shapeCollector.addFigure(circle1);
        shapeCollector.addFigure(triangle1);
        shapeCollector.removeFigure(circle1);


        Assert.assertEquals(2, shapeCollector.getShapes().size());
    }

    @Test
    public void testGetFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square1 = new Square(5);
        Shape triangle1 = new Triangle(3,4,5);
        Shape circle1 = new Circle(3);

        shapeCollector.addFigure(square1);
        shapeCollector.addFigure(circle1);
        shapeCollector.addFigure(triangle1);
        Shape result = shapeCollector.getFigure(1);

        Assert.assertEquals(circle1, result);
    }

    @Test
    public void testShowFigures(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square1 = new Square(5);
        Shape triangle1 = new Triangle(3,4,5);
        Shape circle1 = new Circle(3);

        shapeCollector.addFigure(square1);
        shapeCollector.addFigure(circle1);
        shapeCollector.addFigure(triangle1);
        String result = shapeCollector.showFigures();

        String expected = square1.getShapeName() + " area " + square1.getField() + " " + circle1.getShapeName() + " area " + circle1.getField() + " " + triangle1.getShapeName() + " area " + triangle1.getField() + " ";

        Assert.assertEquals(expected, result);
    }
}
