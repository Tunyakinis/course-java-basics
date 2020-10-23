package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battalegroundtest;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground.Enemy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EnemyTest {
    Enemy enemy = new Enemy(50);

    @Test
    void enemyTest() {
        Assertions.assertEquals(true, enemy.isAlive(enemy));
        Assertions.assertEquals(45, enemy.takeDamage(5));
    }
}
