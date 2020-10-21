package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.housetest;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.house.Persian;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.house.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersianTest {
    Person human = new Person(25);
    Persian persian = new Persian("Musya");

    @Test
    void catMewTest() {
        Assertions.assertEquals("mew-meeeeeew", persian.mew());
    }

    @Test
    void catPurrTest() {
        Assertions.assertEquals("purr-puuuuurr", persian.purr());
    }

    @Test
    void persianMewTest() {
        persian.mew(human);
        Assertions.assertEquals(20, human.getHappiness());
    }

    @Test
    void persianPurrTest() {
        persian.purr(human);
        Assertions.assertEquals(35, human.getHappiness());
    }
}
