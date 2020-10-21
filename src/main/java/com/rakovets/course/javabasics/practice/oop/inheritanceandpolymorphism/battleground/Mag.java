package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

public class Mag extends Hero {
    public Mag(String name, int health) {
        super(name);
        this.health = health;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(25);
        System.out.println("Your Mage attacks the enemy");
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(30);
        System.out.println("Your Mage is under attack");
    }
}
