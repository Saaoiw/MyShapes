package com.brainacad.oop.testshapes_2_8;


/**
 * Created by Work on 20.09.2016.
 *

 */
public class Rectangle extends Shape implements Comparable{
    private double width;
    private double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcArea() {
        return getHeight() * getWidth();
    }

    @Override
    public String toString(){
        return "This is Rectangle, color is " + getShapeColor() + ", width = " + getWidth() + ", height = " + getHeight() +"\n" +
                "Shape area is: " + calcArea();
    }

    @Override
    public void draw() {
        System.out.println("This is Rectangle, color is " + getShapeColor() + ", width = " + getWidth() + ", height = " + getHeight() +
                " Shape area is: " + calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Rectangle rectangle = (Rectangle) o;
        if (this.calcArea() == rectangle.calcArea()) return 0;
        if (this.calcArea() > rectangle.calcArea()) return 1;
        else return -1;
    }
}
