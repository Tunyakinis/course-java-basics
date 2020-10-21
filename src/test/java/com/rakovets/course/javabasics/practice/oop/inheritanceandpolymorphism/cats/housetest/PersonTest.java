package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.housetest;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.house.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    Person human = new Person(15);


    @Test
    void personTest() {
        Assertions.assertEquals(15, human.getHappiness());
        Assertions.assertEquals(23, human.takeHappiness(8));
    }
}
