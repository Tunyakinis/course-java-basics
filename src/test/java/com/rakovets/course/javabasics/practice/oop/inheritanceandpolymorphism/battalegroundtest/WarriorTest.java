package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battalegroundtest;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground.Warrior;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WarriorTest {
    Warrior warrior = new Warrior("Volodya", 36);

    @Test
    void archerTest() {
        Assertions.assertEquals("Volodya", warrior.getName());
        Assertions.assertEquals(36, warrior.getHealth());
    }
}
