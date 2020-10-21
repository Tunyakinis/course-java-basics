package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

public class Warrior extends Hero {
    public Warrior(String name, int health) {
        super(name);
        this.health = health;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(20);
        System.out.println("Your Warrior attacks the enemy");
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(15);
        System.out.println("Your Warrior is under attack");
    }
}
