package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

public class Zombie extends Enemy {
    private boolean wasZombieDead = true;

    public Zombie(int health) {
        super(health);
    }

    public int zombieAbility(Zombie zombie) {
        if (this.health <= 0) {
            if (!wasZombieDead) {
                this.setHealth(50);
            }
        }
        return this.health = 0;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }
}
