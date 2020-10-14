package com.rakovets.course.javabasics.practice.oop.classesandobjects;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class PointTest {
    public static void main(String[] args) {
        Point firstPoint = new Point(2,8);
        Point secondPoint = new Point(5,10);
        double distance = firstPoint.distance(secondPoint);
        DecimalFormat newFormat = new DecimalFormat("#.##", DecimalFormatSymbols.getInstance(Locale.US));
        System.out.printf("x: %d, y: %d\n", firstPoint.getX(), firstPoint.getY());
        System.out.printf("x2: %d, y2: %d\n", secondPoint.getX(), secondPoint.getY());
        System.out.printf("Distance: %.2f\n", distance);
        secondPoint.setX(8);
        secondPoint.setY(15);
        System.out.printf("x2: %d, y2: %d\n", secondPoint.getX(), secondPoint.getY());
        System.out.printf("Distance: %.2f\n", firstPoint.distance(secondPoint));
    }
}
