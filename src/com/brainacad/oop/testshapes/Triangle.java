package com.brainacad.oop.testshapes;

import javafx.scene.shape.TriangleMesh;

/**
 * Created by Work on 20.09.2016.
 * 2_7_9
 * Add to project  “MyShapes” a new class “Triangle” which is a subclass of Shape.
 Add to class Triangle a private field’s a, b, c (of double type) which is sides of triangle.
 In class Triangle override  calcArea() method which must return area of triangle
 (By the formula:  area  =  , where  ).
 In class Triangle override the toString() method. It must return string which contain name of shape, color and a, b, c sides of triangle. Example:
 “This is Triangle, color: BLACK, a=5, b=5, c=5”
 Add to class Triangle constructor with color, a, b and c arguments.

 Then add to class Main code to create one Triangle object and print it name, color, a, b, c sides of triangle to console. Then invoke calcArea() method and print result to console.
 Program output must looks like:
 “This is Triangle, color: BLACK, a=5, b=5, c=5”
 “Shape area is: 10.825”

 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double calcArea() {
        double s = (getA() + getB() + getC()) / 2;
        return Math.sqrt(s * ( s - getA() ) * ( s - getB() ) * ( s - getC() ));
    }

    @Override
    public String toString() {
        return "This is Triangle, color is " + getShapeColor() + ", a = " + getA() + ", b = " + getB() + ", c = " + getC()
                + "\n" + "Shape area is: " + calcArea();
    }

}
