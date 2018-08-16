package com.kodilla.testing.shape;

public class Triangle implements Shape {
    double sideLengthA;
    double sidelengthB;
    double sideLengthC;
    double perimeter;


    public Triangle(double sideLengthA, double sidelengthB, double sideLengthC) {
        this.sideLengthA = sideLengthA;
        this.sidelengthB = sidelengthB;
        this.sideLengthC = sideLengthC;
        this.perimeter = sideLengthA + sidelengthB + sideLengthC;
    }

    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public Double getField() {
         return Math.sqrt(perimeter*(perimeter-sideLengthA)*(perimeter-sidelengthB)*(perimeter-sideLengthC));
    }
}
