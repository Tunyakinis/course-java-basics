package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.house;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "meeeeeeeeew";
    }

    @Override
    public String purr() {
        return "puuuuuuurr";

    }
    @Override
    public void mew(Person person) {
        person.takeHappiness(-6);
    }

    @Override
    public void purr(Person person) {
        person.takeHappiness(9);
    }
}
