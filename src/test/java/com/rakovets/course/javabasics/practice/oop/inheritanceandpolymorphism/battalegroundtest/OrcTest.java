package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battalegroundtest;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground.Orc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrcTest {
    Orc orc = new Orc(30);

    @Test
    void orcTest() {
        orc.setDamage(5);
        Assertions.assertEquals(true, orc.isAlive(orc));
        Assertions.assertEquals(25, orc.takeDamage(5));
        Assertions.assertEquals(23, orc.orcAbility(orc));
    }
}

