package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.house;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "mew-meeeeeew";
    }

    @Override
    public String purr() {
        return "purr-puuuuurr";
    }

    @Override
    public void mew(Person person) {
        person.takeHappiness(-5);
    }

    @Override
    public void purr(Person person) {
        person.takeHappiness(10);
    }
}

