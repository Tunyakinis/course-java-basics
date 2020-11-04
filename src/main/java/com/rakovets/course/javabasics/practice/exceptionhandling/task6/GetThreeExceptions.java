package com.rakovets.course.javabasics.practice.exceptionhandling.task6;

public class GetThreeExceptions {

    public static void threeExceptions() throws NegativeArraySizeException, ArrayIndexOutOfBoundsException, ArithmeticException {
        int a = (int) (Math.random() * 3)-1;
        System.out.println(a);
        int b = 42 / a;
        System.out.println(b);
        int[] c = new int[a];
        c[a] = 6;
    }
}
