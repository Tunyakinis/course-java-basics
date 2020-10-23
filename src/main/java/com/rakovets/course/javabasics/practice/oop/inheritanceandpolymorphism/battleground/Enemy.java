package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

public class Enemy implements Mortal {
    protected int health;
    protected int damage;

    public Enemy(int health) {
        this.health = health;
    }

    public int takeDamage(int damage) {
        this.health -= damage;
        return this.health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
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