package com.rakovets.course.javabasics.practice.jcf.list.studio;

import java.util.Comparator;

public class ActorLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor actor, Actor actor1) {
        return actor.getLastName().compareTo(actor1.getLastName());
    }
}
