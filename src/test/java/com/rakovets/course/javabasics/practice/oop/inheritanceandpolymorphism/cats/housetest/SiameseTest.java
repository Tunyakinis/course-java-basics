package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.housetest;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.house.Siamese;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.house.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SiameseTest {
    Person human = new Person(32);
    Siamese siamese = new Siamese("Vas'ka");

    @Test
    void catMewTest() {
        Assertions.assertEquals("meeeeeeeeew", siamese.mew());
    }

    @Test
    void catPurrTest() {
        Assertions.assertEquals("puuuuuuurr", siamese.purr());
    }

    @Test
    void siameseMewTest() {
        siamese.mew(human);
        Assertions.assertEquals(26, human.getHappiness());
    }

    @Test
    void siamesePurrTest() {
        siamese.purr(human);
        Assertions.assertEquals(41, human.getHappiness());
    }
}
