package com.rakovets.course.javabasics.practice.exceptionhandling.task4;

public class MarkValueException extends RuntimeException {
    private String message;

    public void RuntimeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

