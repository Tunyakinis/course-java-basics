package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battalegroundtest;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground.Warrior;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground.Zombie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WarriorTest {
    Warrior warrior = new Warrior("Volodya", 36);
    Zombie zombie = new Zombie(50);

    @Test
    void warriorTest() {
        Assertions.assertEquals("Volodya", warrior.getName());
        Assertions.assertEquals(36, warrior.getHealth());
        warrior.attackEnemy(zombie);
        warrior.currentHealth(warrior);
        warrior.heroTakesDamage(25);
    }
}
