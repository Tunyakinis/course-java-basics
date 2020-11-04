package com.rakovets.course.javabasics.practice.exceptionhandling.task2;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i <= arr.length; i++) {
            try {
                arr[i] = random.nextInt(100);
                System.out.println(arr[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);;
            }
        }
    }
}