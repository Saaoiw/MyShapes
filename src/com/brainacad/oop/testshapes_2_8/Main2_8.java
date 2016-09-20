package com.brainacad.oop.testshapes_2_8;


import java.util.Arrays;

/**
 * Created by Таня on 20.09.2016.
 * 2_8_3
 * You must implement the Comparable interface to each of shape types (Rectangle, Circle, Triangle).
 * Implement the compareTo method for each of shape types class so that it compares the areas of the shapes.
 Create two different Rectangle instances and compare it to each other. Print result to console.
 2_8_4
 Add code to main() method in class Main to create array (Rectangle[] arr2) of six Rectangle objects
 and sort it using Arrays.sort() method.
 Add code to main() method in class Main to iterate over Rectangles array in loop (use for-each loop) and invoke draw() method.

 Execute the program, output must looks like:

 This is Rectangle, color: RED, width=10, height=10,  area is: 100
 This is Rectangle, color: RED, width=11, height=22,  area is: 242
 This is Rectangle, color: RED, width=100, height=5,  area is: 500
 …


 */
public class Main2_8 {
    public static void main(String[] args) {

        Circle circle = new Circle("Green", 100);
        Rectangle rectangle = new Rectangle("Yellow", 11, 22);
        Triangle triangle = new Triangle("Black", 5, 5, 5);

        Circle circle1 = new Circle("Green", 10);
        Rectangle rectangle1 = new Rectangle("Yellow", 11, 22);
        Triangle triangle1 = new Triangle("Black", 5, 5, 5);

        Rectangle[] rectangles = new Rectangle[]{new Rectangle("Yellow", 111, 22), new Rectangle("Yellow", 121, 22),
                                new Rectangle("Yellow", 131, 22), new Rectangle("Yellow", 141, 22), new Rectangle("Yellow", 151, 22),
                                new Rectangle("Yellow", 161, 22)};

        Arrays.sort(rectangles);
        for (Rectangle rectangleLoop: rectangles) {
            rectangleLoop.draw();
        }

        System.out.println(rectangle.compareTo(rectangle1));
    }
}
