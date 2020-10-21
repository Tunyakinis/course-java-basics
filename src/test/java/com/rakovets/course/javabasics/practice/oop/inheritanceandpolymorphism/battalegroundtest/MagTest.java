package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battalegroundtest;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground.Mag;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MagTest {
    Mag mag = new Mag("Vasya", 33);

    @Test
    void archerTest() {
        Assertions.assertEquals("Vasya", mag.getName());
        Assertions.assertEquals(33, mag.getHealth());
    }
}
