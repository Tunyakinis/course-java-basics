package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.housetest;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.house.Sphinx;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.house.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SphinxTest {
    Person human = new Person(92);
    Sphinx sphinx = new Sphinx("Tisha");

    @Test
    void catMewTest() {
        Assertions.assertEquals("mew-mew", sphinx.mew());
    }

    @Test
    void catPurrTest() {
        Assertions.assertEquals("purr-purr", sphinx.purr());
    }

    @Test
    void sphinxMewTest() {
        sphinx.mew(human);
        Assertions.assertEquals(91, human.getHappiness());
    }

    @Test
    void sphinxPurrTest() {
        sphinx.purr(human);
        Assertions.assertEquals(95, human.getHappiness());
    }
}
