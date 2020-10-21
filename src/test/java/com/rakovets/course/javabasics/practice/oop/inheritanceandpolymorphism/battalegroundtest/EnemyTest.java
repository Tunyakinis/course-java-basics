package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battalegroundtest;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground.Archer;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground.Enemy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EnemyTest {
    Enemy enemy = new Enemy( 0);

    @Test
    void enemyTest() {
        Assertions.assertEquals(0, enemy.getHealth());
        Assertions.assertEquals(false, enemy.isAlive(enemy));
    }
}
