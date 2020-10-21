package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

public class Enemy implements Mortal {
    public int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public void attackHero(Hero hero) {
        hero.takeDamage(20);
        System.out.println("Your hero is under attack");
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public boolean isAlive(Enemy enemy) {
        if (health > 0) {
            return true;
        }
        return false;
    }
}
