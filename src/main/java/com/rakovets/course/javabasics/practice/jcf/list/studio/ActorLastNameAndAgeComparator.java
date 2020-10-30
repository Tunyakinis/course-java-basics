package com.rakovets.course.javabasics.practice.jcf.list.studio;

import java.util.Comparator;

public class ActorLastNameAndAgeComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor actor, Actor actor1) {
        var result = actor.getLastName().compareTo(actor1.getLastName());
        if (result == 0) {
            return Double.compare(actor.getAge(), actor1.getAge());
        } else {
            return result;
        }
    }
}