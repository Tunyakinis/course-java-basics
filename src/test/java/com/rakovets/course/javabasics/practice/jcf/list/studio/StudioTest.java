package com.rakovets.course.javabasics.practice.jcf.list.studio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

public class StudioTest {
    @Test
    void StudioTest() {
        LinkedList<Actor> troupe = new LinkedList<>();
        troupe.add(new Actor("Dasha", "Kosarevskaya", 500, 25));
        troupe.add(new Actor("Misha", "Lopachyk", 600, 26));
        troupe.add(new Actor("Dima", "Boris", 700, 27));
        Studio studio = new Studio(troupe);
        LinkedList<Actor> sortedTroupe = studio.fire(troupe);
        assertEquals("[Dasha Kosarevskaya fee:500 age:25, Misha Lopachyk fee:600 age:26]", sortedTroupe.toString());
    }

    @Test
    void getTroupeSortedByAgeComparator() {
        LinkedList<Actor> troupe = new LinkedList<>();
        troupe.add(new Actor("Dasha", "Kosarevskaya", 500, 27));
        troupe.add(new Actor("Misha", "Lopachyk", 600, 25));
        troupe.add(new Actor("Dima", "Boris", 700, 23));
        Studio studio = new Studio(troupe);
        LinkedList<Actor> sortedTroupe = studio.getTroupeSortedByAgeComparator(troupe);
        assertEquals("[Dima Boris fee:700 age:23, Misha Lopachyk fee:600 age:25, Dasha Kosarevskaya fee:500 age:27]", sortedTroupe.toString());
    }

    @Test
    void getTroupeSortedByFeeComparatorTest() {
        LinkedList<Actor> troupe = new LinkedList<>();
        troupe.add(new Actor("Dasha", "Kosarevskaya", 800, 25));
        troupe.add(new Actor("Misha", "Lopachyk", 600, 26));
        troupe.add(new Actor("Dima", "Boris", 200, 27));
        Studio studio = new Studio(troupe);
        LinkedList<Actor> sortedTroupe = studio.getTroupeSortedByFeeComparator(troupe);
        assertEquals("[Dima Boris fee:200 age:27, Misha Lopachyk fee:600 age:26, Dasha Kosarevskaya fee:800 age:25]", sortedTroupe.toString());
    }

    @Test
    void getTroupeSortedByFeeAndLastNameComparatorTest() {
        LinkedList<Actor> troupe = new LinkedList<>();
        troupe.add(new Actor("Dasha", "Kosarevskaya", 800, 25));
        troupe.add(new Actor("Misha", "Lopachyk", 600, 26));
        troupe.add(new Actor("Dima", "Boris", 200, 27));
        Studio studio = new Studio(troupe);
        LinkedList<Actor> sortedTroupe = studio.getTroupeSortedByFeeAndLastNameComparator(troupe);
        assertEquals("[Dima Boris fee:200 age:27, Misha Lopachyk fee:600 age:26, Dasha Kosarevskaya fee:800 age:25]", sortedTroupe.toString());
    }

    @Test
    void getTroupeSortedByLastNameAndAgeComparatorTest() {
        LinkedList<Actor> troupe = new LinkedList<>();
        troupe.add(new Actor("Dasha", "Kosarevskaya", 800, 25));
        troupe.add(new Actor("Misha", "Lopachyk", 600, 26));
        troupe.add(new Actor("Dima", "Boris", 200, 27));
        Studio studio = new Studio(troupe);
        LinkedList<Actor> sortedTroupe = studio.getTroupeSortedByLastNameAndAgeComparator(troupe);
        assertEquals("[Dima Boris fee:200 age:27, Dasha Kosarevskaya fee:800 age:25, Misha Lopachyk fee:600 age:26]", sortedTroupe.toString());
    }

    @Test
    void getTroupeSortedByLastNameComparatorTest() {
        LinkedList<Actor> troupe = new LinkedList<>();
        troupe.add(new Actor("Dasha", "Kosarevskaya", 800, 25));
        troupe.add(new Actor("Misha", "Lopachyk", 600, 26));
        troupe.add(new Actor("Dima", "Boris", 200, 27));
        Studio studio = new Studio(troupe);
        LinkedList<Actor> sortedTroupe = studio.getTroupeSortedByLastNameComparator(troupe);
        assertEquals("[Dima Boris fee:200 age:27, Dasha Kosarevskaya fee:800 age:25, Misha Lopachyk fee:600 age:26]", sortedTroupe.toString());
    }
}

