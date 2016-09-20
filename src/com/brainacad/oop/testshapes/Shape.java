package com.brainacad.oop.testshapes;

/**
 * Created by Work on 20.09.2016.
 * 2_7_6
 * Create new project named MyShapes. Add package “com.brainacad.oop.testshapes”.
 You should design a super class “Shape”, which defines the public method of all the shapes called calcArea (),
 which returns the area (double type) of that particular shape.
 (Our program uses many kinds of shapes, such as triangle, rectangle and so on.)
 Define a Shape class as:
 public class Shape {
 //declare private instance variable “shapeColor” of String type
 // create a constructor for Shape with shapeColor parameter
 // Override  toString() to return the string of Shape name and color, example:
 “Shape, color is: RED”
 // All shapes must has a method called calcArea (), write public method (empty)  calcArea ¬that returns double value ( 0.0 ) .
 }
 Create class Main with method main().
 The program must demonstrate the creation of one Shape object and print it name and color to console.
 Then add code to invoke calcArea() method and print result to console.
 Program output must looks like:
 “This is Shape, color is: RED”
 “Shape area is: 0”
 2_7_10:
 Use “MyShapes” project. The program must demonstrate the creation of an array of different types of shapes
 and print characteristics of each shape on console.
 1.	Add new code to method main() in class Main:
 2.	Create array (Shape[] arr) of different Shapes objects, (five  rectangles, two circles and two triangles);
 3.	Add code to iterate over shapes array in loop (use for-each loop) and print characteristics of each shape on console
 (using “toString()” method) with area of this shape (using “calcArea()” method).
 4.	Execute the program, output must looks like:

 This is Rectangle, color: RED, width=11, height=22,  area is: 242
 This is Triangle, color: BLACK, a=5, b=5, c=5, area is: 10.825
 This is Circle, color: GREEN, radius=10, area is: 314.15926
 …
 5.	Add code to calculate total area of all shape types. Define “sumArea” (of double type) local variable and use it in loop to sum total area for all shapes.
 6.	Add code to sum total area for each shape types. Define “sumRectArea”, “sumTriangleArea”, “sumCircleArea” (of double type) local variables and use it in loop to sum total area for each shape type. You should use instanceof keyword for determining, total area for each of shape types (Rectangle, Circle, Triangle) and print it to console.
 7.	Execute the program, output must looks like:
 Rectangles total area: 234.54
 Circle total area: 547.231
 Triangle total area: 356.56
 2_8_1
 Open project MyShapes. (from 2.7 labs)
 Rewrite the class “Shape” to make it abstract and change calcArea() method declaration to make it abstract too.
 Execute program



 */
class Shape {
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

    public double calcArea(){
        return 0.0;
    }


}