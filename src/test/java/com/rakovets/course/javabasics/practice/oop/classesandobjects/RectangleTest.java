package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class RectangleTest {
    public static void main(String[] args) {
    Point topLeftPoint = new Point(3, 9);
    Point bottomRightPoint = new Point(12, 15);
    Rectangle rectangle = new Rectangle(topLeftPoint, bottomRightPoint);
    System.out.printf("Perimeter is: %.2f\n", rectangle.getPerimeter());
    System.out.printf("Area is: %.2f\n", rectangle.getArea());
    }
}
