package com.kodilla.testing.shape;

public class Square implements Shape {
    private double sideLength;

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public String getShapeName() {
        return "square";
    }

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public Double getField() {
        return sideLength*sideLength;
    }
}
