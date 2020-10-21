package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.house;

public class Sphinx extends Cat {
    public Sphinx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "mew-mew";
    }

    @Override
    public String purr() {
        return "purr-purr";
    }

    @Override
    public void mew(Person person) {
        person.takeHappiness(-1);
    }

    @Override
    public void purr(Person person) {
        person.takeHappiness(3);
    }
}
