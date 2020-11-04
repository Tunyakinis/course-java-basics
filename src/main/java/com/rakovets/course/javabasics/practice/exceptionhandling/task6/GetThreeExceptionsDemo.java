package com.rakovets.course.javabasics.practice.exceptionhandling.task6;

public class GetThreeExceptionsDemo {
    public static void main(String[] args) {
        try {
            GetThreeExceptions.threeExceptions();
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException");
        }
    }
}