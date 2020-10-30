package com.rakovets.course.javabasics.practice.jcf.list.studio;

import java.util.Comparator;

public class ActorFeeAndLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor actor, Actor actor1) {
        if (actor.getLastName().compareTo(actor1.getLastName()) != 0)
            return actor.getLastName().compareTo(actor1.getLastName());
        else return actor.getFee() - (actor1.getFee());
    }
}