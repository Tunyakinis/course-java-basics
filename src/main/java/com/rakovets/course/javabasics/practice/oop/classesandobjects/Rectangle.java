package com.rakovets.course.javabasics.practice.oop.classesandobjects;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Rectangle {
    private Point topLeftPoint;
    private Point bottomRightPoint;

    Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    public Point getTopLeftPoint() {
        return topLeftPoint;
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;

    }

    public Point getBottomRightPoint() {
        return bottomRightPoint;
    }

    public void setBottomRightPoint(Point bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;

    }

    public double getPerimeter() {
        double firstSide = Math.abs((topLeftPoint.getX() - bottomRightPoint.getX()) * 2);
        double secondSide = Math.abs((topLeftPoint.getY() - bottomRightPoint.getY()) * 2);
        double perimeter = firstSide + secondSide;
        DecimalFormat newFormat = new DecimalFormat("#.##", DecimalFormatSymbols.getInstance(Locale.US));
        double result = Double.valueOf(newFormat.format(perimeter));
        return result;
    }

    public double getArea() {
        double firstSide = Math.abs((topLeftPoint.getX() - bottomRightPoint.getX()) * 2);
        double secondSide = Math.abs((topLeftPoint.getY() - bottomRightPoint.getY()) * 2);
        double area = firstSide * secondSide;
        DecimalFormat newFormat = new DecimalFormat("#.##", DecimalFormatSymbols.getInstance(Locale.US));
        double result = Double.valueOf(newFormat.format(area));
        return result;
    }
}
