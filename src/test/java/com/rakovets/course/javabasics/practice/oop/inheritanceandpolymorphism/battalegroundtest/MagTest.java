package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battalegroundtest;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground.Mag;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground.Zombie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MagTest {
    Mag mag = new Mag("Vasya", 100);
    Zombie zombie = new Zombie(50);

    @Test
    void magTest() {
        Assertions.assertEquals("Vasya", mag.getName());
        Assertions.assertEquals(100, mag.getHealth());
        mag.attackEnemy(zombie);
        mag.currentHealth(mag);
        mag.heroTakesDamage(25);
    }
}
