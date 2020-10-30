package com.rakovets.course.javabasics.practice.jcf.list.studio;

import java.util.Comparator;

public class ActorAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor actor, Actor actor1) {
        return  actor.getAge() - actor1.getAge();
    }
}