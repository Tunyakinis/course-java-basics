package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battalegroundtest;


import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground.Zombie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZombieTest {

    Zombie zombie = new Zombie(20);

    @Test
    void zombieTest() {
        Assertions.assertEquals(true, zombie.isAlive(zombie));
        Assertions.assertEquals(10, zombie.takeDamage(10));
        zombie.setHealth(0);
        Assertions.assertEquals(50, zombie.zombieAbility(zombie));
    }
}
