package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.house;

public class Person {
    protected int happiness;

    public Person(int startHappiness) {
        this.happiness = startHappiness;
    }

    public int takeHappiness(int happiness) {
        return this.happiness += happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getHappiness() {
        return this.happiness;
    }
}
