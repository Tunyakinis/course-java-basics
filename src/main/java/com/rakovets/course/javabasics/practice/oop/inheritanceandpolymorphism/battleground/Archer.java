package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

public class Archer extends Hero {
    private int damage = 30;

    public Archer(String name, int health) {
        super(name);
        this.health = health;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(damage);
        System.out.println("You have attacked enemy unit and takes " + damage + " of Health");
    }
}

