package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class TimeTest {
    public static void main(String[] args) {
        Time result = new Time(35, 12, 36);
        Time totalSeconds = new Time(5);
        System.out.printf("Hours: %d, Minutes: %d, Seconds: %d", result.getHours(), result.getMinutes(), result.getSeconds());
        System.out.printf(". TotalSeconds: %d\n", totalSeconds.getTotalSeconds());
        result.setSeconds(3);
        result.setMinutes(6);
        result.setHours(9);
        System.out.printf("Hours: %d, Minutes: %d, Seconds: %d", result.getHours(), result.getMinutes(), result.getSeconds());
    }
}
