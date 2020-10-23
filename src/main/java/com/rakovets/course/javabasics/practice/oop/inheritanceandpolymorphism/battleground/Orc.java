package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

public class Orc extends Enemy {
    private int berserkModeDamage = 18;

    public Orc(int health) {
        super(health);
    }

    public int orcAbility(Orc orc) {
        if (this.health < 30) {
            damage += berserkModeDamage;
        }
        return damage;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }
}
