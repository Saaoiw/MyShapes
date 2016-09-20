package com.brainacad.oop.testshapes_2_8;



/**
 * Created by Work on 20.09.2016.
 *

 */
public class Triangle extends Shape implements Comparable{
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

    @Override
    public void draw() {
        System.out.println("This is Triangle, color is " + getShapeColor() + ", a = " + getA() + ", b = " + getB() + ", c = " + getC()
                + " Shape area is: " + calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Triangle triangle = (Triangle)o;
        if (this.calcArea() == triangle.calcArea()) return 0;
        if (this.calcArea() > triangle.calcArea()) return 1;
        else return -1;
    }
}
