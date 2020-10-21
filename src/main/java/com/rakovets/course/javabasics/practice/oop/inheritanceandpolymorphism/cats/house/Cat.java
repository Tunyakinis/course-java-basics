package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.house;

public class Cat {
    protected String name;

    public Cat(String name) {
        this.name = name;
    }

    public void mew(Person person) {
        person.takeHappiness(-1);
    }

    public void purr(Person person) {
        person.takeHappiness(1);
    }

    public String mew() {
        return "Mew";
    }

    public String purr() {
        return "Purr";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

