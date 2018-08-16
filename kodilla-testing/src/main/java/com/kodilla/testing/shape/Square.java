package com.kodilla.testing.shape;

public class Square implements Shape {
    double sideLength;

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
