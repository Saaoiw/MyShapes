package com.brainacad.oop.testshapes_2_8;



/**
 * Created by Work on 20.09.2016.


 */
public class Circle extends Shape implements Comparable{
    private double radius;
    private final double PI = 3.14;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea(){
        return PI*(getRadius() * getRadius());
    }

    @Override
    public String toString(){
        return "This is Circle, color is " + getShapeColor() + ", raius = " + getRadius() + "\n" +
                "Shape area is: " + calcArea();
    }

    @Override
    public void draw() {
        System.out.println("This is Circle, color is " + getShapeColor() + ", raius = " + getRadius() +
                " Shape area is: " + calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Circle circle = (Circle) o;
        if (this.calcArea() == circle.calcArea()) return 0;
        if (this.calcArea() > circle.calcArea()) return 1;
        else return -1;
    }
}
