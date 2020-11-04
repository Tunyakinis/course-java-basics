package com.rakovets.course.javabasics.practice.exceptionhandling.task1;

public class Task1 {
    public static void main(String[] args) {
        try {
            String string = null;
            string.equals("Long Live Belarus");
        } catch (
                NullPointerException e) {
            System.out.println(e);;
        }
    }
}