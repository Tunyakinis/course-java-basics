package com.rakovets.course.javabasics.practice.jcf.list.studio;

import java.util.LinkedList;

public class Studio {
    private LinkedList<Actor> troupe;

    public Studio(LinkedList<Actor> troupe) {
        this.troupe = troupe;
    }

    public LinkedList<Actor> fire(LinkedList<Actor> troupe) {
        troupe.sort(new ActorFeeComparator());
        troupe.removeLast();
        return troupe;
    }

    public LinkedList<Actor> getTroupeSortedByAgeComparator(LinkedList<Actor> troupe) {
        troupe.sort(new ActorAgeComparator());
        return troupe;
    }

    public LinkedList<Actor> getTroupeSortedByFeeComparator(LinkedList<Actor> troupe) {
        troupe.sort(new ActorFeeComparator());
        return troupe;
    }

    public LinkedList<Actor> getTroupeSortedByFeeAndLastNameComparator(LinkedList<Actor> troupe) {
        troupe.sort(new ActorFeeAndLastNameComparator());
        return troupe;
    }

    public LinkedList<Actor> getTroupeSortedByLastNameAndAgeComparator(LinkedList<Actor> troupe) {
        troupe.sort(new ActorLastNameAndAgeComparator());
        return troupe;
    }

    public LinkedList<Actor> getTroupeSortedByLastNameComparator(LinkedList<Actor> troupe) {
        troupe.sort(new ActorLastNameComparator());
        return troupe;
    }
}
