package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battalegroundtest;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground.Archer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArcherTest {
    Archer archer = new Archer("Misha", 95);

    @Test
    void archerTest() {
        Assertions.assertEquals("Misha", archer.getName());
        Assertions.assertEquals(95, archer.getHealth());
    }
}

