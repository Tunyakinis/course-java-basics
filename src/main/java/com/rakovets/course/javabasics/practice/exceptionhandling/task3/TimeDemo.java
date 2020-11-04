package com.rakovets.course.javabasics.practice.exceptionhandling.task3;

public class TimeDemo {
    public static void main(String[] args) {
        Time time = new Time(0, 0, -1);
        try {
            time.getTotalSeconds();
        } catch (TimeValueException e) {
            e.printStackTrace(System.out);
        }
    }
}
