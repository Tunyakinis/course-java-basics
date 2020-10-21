package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

public class Archer extends Hero{
    public Archer(String name, int health) {
        super(name);
        this.health = health;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(18);
        System.out.println("Your Archer attacks the enemy");
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(12);
        System.out.println("Your Archer is under attack");
    }
}
