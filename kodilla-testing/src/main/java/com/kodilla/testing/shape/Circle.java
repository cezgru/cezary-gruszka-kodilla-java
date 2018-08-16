package com.kodilla.testing.shape;

public class Circle implements Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public Double getField() {
        return radius*radius*Math.PI;
    }
}
