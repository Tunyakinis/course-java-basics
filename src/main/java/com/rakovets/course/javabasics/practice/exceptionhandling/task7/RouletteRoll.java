package com.rakovets.course.javabasics.practice.exceptionhandling.task7;

public class RouletteRoll {

    private int value;

    public RouletteRoll(int value) {
        this.value = value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    @Override
    public String toString(){
        return String.valueOf(value);
    }
}