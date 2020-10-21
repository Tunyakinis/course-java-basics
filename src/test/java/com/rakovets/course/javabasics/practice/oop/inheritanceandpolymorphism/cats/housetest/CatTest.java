package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.housetest;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.house.Cat;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.house.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CatTest {
    Cat barsik = new Cat("Barsik");
    Person human = new Person(70);

    @Test
    void catMewTest() {
        Assertions.assertEquals("Mew", barsik.mew());
    }

    @Test
    void catPurrTest() {
        Assertions.assertEquals("Purr", barsik.purr());
    }

    @Test
    void catBarsikMewTest() {
        barsik.mew(human);
        Assertions.assertEquals(69, human.getHappiness());

    }

    @Test
    void catBarsikPurrTest() {
        barsik.purr(human);
        Assertions.assertEquals(71, human.getHappiness());

    }

}