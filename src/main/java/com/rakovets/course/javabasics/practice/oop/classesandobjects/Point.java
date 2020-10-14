package com.rakovets.course.javabasics.practice.oop.classesandobjects;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point point) {
        double diagonal = Math.sqrt(Math.pow((point.x - this.x), 2) + Math.pow((point.y - this.y), 2));
        DecimalFormat newFormat = new DecimalFormat("#.##", DecimalFormatSymbols.getInstance(Locale.US));
        double result = Double.valueOf(newFormat.format(diagonal));
        return result;
    }
}
