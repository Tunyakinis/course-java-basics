package com.rakovets.course.javabasics.practice.exceptionhandling.task5;

public class ParseDateException extends Exception {
    private String message;

    public ParseDateException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
