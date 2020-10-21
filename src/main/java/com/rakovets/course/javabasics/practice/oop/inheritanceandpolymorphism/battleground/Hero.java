package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

public abstract class Hero {
    protected String name;
    protected int health;

    public Hero(String name) {
        this.name = name;
    }

    public abstract void attackEnemy(Enemy enemy);

    public void currentHealth(Hero hero) {
        if (hero.health > 0) {
            System.out.println("Health: " + hero.health);
        }
        System.out.println("Your Hero is dead");
    }

    public void attackHero(Hero hero) {
        hero.takeDamage(10);
        System.out.println("Your Hero is under attack");
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }
}
