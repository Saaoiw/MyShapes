package com.brainacad.oop.testshapes;

/**
 * Created by Таня on 20.09.2016.
 */
public class Main {
     public static void main(String[] args) {
            Shape shape = new Shape("Red");
            Circle circle = new Circle("Green", 10);
            Rectangle rectangle = new Rectangle("Yellow", 11, 22);
            Triangle triangle = new Triangle("Black", 5, 5 , 5);

            System.out.println(shape.toString());
            System.out.println(circle.toString());
            System.out.println(rectangle.toString());
            System.out.println(triangle.toString());

            double sumRectArea = 0;
            double sumTriangleArea = 0;
            double sumCircleArea = 0;

            Circle circle1 = new Circle("Green", 10);
            Rectangle rectangle1 = new Rectangle("Yellow", 11, 22);
            Triangle triangle1 = new Triangle("Black", 5, 5 , 5);

            Shape[] shapes = new Shape[]{circle, circle1, rectangle, rectangle1, triangle, triangle1};
            for (Shape shapeLoop : shapes ) {
                if (shapeLoop instanceof Circle) sumCircleArea += shapeLoop.calcArea();
                if (shapeLoop instanceof Triangle) sumTriangleArea += shapeLoop.calcArea();
                if (shapeLoop instanceof Rectangle) sumRectArea += shapeLoop.calcArea();
            }

            System.out.println("Circle total area: " + sumCircleArea);
            System.out.println("Triangle total area: " + sumTriangleArea);
            System.out.println("Rectangles total area: " + sumRectArea);

        }
    }

