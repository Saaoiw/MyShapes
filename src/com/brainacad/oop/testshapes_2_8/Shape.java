package com.brainacad.oop.testshapes_2_8;

/**
 * Created by Таня on 20.09.2016.
 * 2_8_1
 * Open project MyShapes. (from 2.7 labs)
 Rewrite the class “Shape” to make it abstract and change calcArea() method declaration to make it abstract too.
 Execute program
 2_8_2
 Add to project  “MyShapes” a new  interface called “Drawable”, with abstract method draw().
 The draw() method has no arguments and does not return a value.
 Implement  interface Drawable to class Shape.
 The classes that implements the Drawable interface will provide actual implementation
 to these abstract method witch print characteristics of each shape on console
 (print to console information about this object from toString() and area of this shape (using “calcArea()” method).
 Add code to main() method in class Main to iterate over shapes array in loop (use for-each loop) and invoke draw() method.
 Execute the program, output must looks like:

 This is Rectangle, color: RED, width=11, height=22,  area is: 242
 This is Triangle, color: BLACK, a=5, b=5, c=5, area is: 10.825
 This is Circle, color: GREEN, radius=10, area is: 314.15926


 */
public abstract class Shape implements Drawable{
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public String toString(){
        return "This is Shape, color is " + getShapeColor() + "\n" +
                "Shape area is: " + calcArea();
    }

    public abstract double calcArea();


}