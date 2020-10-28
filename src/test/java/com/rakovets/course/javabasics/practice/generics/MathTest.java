package com.rakovets.course.javabasics.practice.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {
    @Test
    void getMaximumOfTypeTest() {
        Math<Integer> integers = new Math();
        Math<Double> doubles = new Math();

        assertEquals(9, integers.getMaximumOfType(3, 6, 9));
        assertEquals(9, integers.getMaximumOfType(-3, -6, 9));

        assertEquals(9.0, doubles.getMaximumOfType(3.0, 6.0, 9.0));
        assertEquals(9.0, doubles.getMaximumOfType(-3.0, -6.0, 9.0));
    }

    @Test
    void getMinimumOfTypeTest() {
        Math<Integer> integers = new Math();
        Math<Double> doubles = new Math();

        assertEquals(3, integers.getMaximumOfType(3, 6, 9, 12, 15));
        assertEquals(-12, integers.getMaximumOfType(-3, -6, 9, -12, 15));

        assertEquals(3.0, doubles.getMaximumOfType(3.0, 6.0, 9.0, 12.0, 15.0));
        assertEquals(-12.0, doubles.getMaximumOfType(-3.0, -6.0, 9.0, -12.0, 15.0));
    }

    @Test
    void getAverageFromArrayTest() {
        Integer[] integers = {0, 2343, 11, 322, 148};
        Double[] doubles = {0.0, 36.1, 33.2, 23.1, 423.1, 64.4};
        Math<Integer> testIntegers = new Math();
        Math<Double> testDoubles = new Math();

        assertEquals(564.80, testIntegers.getAverageFromArray(integers));
        assertEquals(96.65, testDoubles.getAverageFromArray(doubles));
    }

    @Test
    void getMaximumFromArrayTest() {
        Integer[] integers = {0, 2343, 11, 322, 148};
        Double[] doubles = {0.0, 36.1, 33.2, 23.1, 423.1, 64.4};
        Math<Integer> testIntegers = new Math();
        Math<Double> testDoubles = new Math();

        assertEquals(2343, testIntegers.getMaximumFromArray(integers));
        assertEquals(423.1, testDoubles.getMaximumFromArray(doubles));
    }

    @Test
    void getMinimumFromArrayTest() {
        Integer[] integers = {0, 2343, 11, 322, 148};
        Double[] doubles = {0.0, 36.1, 33.2, 23.1, 423.1, 64.4};
        Math<Integer> testIntegers = new Math();
        Math<Double> testDoubles = new Math();

        assertEquals(0, testIntegers.getMinimumFromArray(integers));
        assertEquals(0.0, testDoubles.getMinimumFromArray(doubles));
    }

    @Test
    void getSortArrayTest() {
        Integer[] integers = {0, 2343, 11, 322, 148};
        Double[] doubles = {0.0, 36.1, 33.2, 23.1, 423.1, 64.4};
        Math<Integer> testIntegers = new Math();
        Math<Double> testDoubles = new Math();

        assertArrayEquals(new Integer[]{0, 11, 148, 322, 2343}, testIntegers.getArraySort(integers));
        assertArrayEquals(new Double[]{0.0, 23.1, 33.2, 36.1, 64.4, 423.1}, testDoubles.getArraySort(doubles));
    }

    @Test
    void getBinarySearchTest() {
        Integer[] integers = {0, 2343, 11, 322, 148};
        Double[] doubles = {0.0, 36.1, 33.2, 23.1, 423.1, 64.4};
        Math<Integer> testIntegers = new Math();
        Math<Double> testDoubles = new Math();

        assertEquals(-1, testDoubles.getBinarySearch(doubles, 25.0));
        assertEquals(2, testDoubles.getBinarySearch(doubles, 33.2));
        assertEquals(3, testIntegers.getBinarySearch(integers, 322));
        assertEquals(-1, testIntegers.getBinarySearch(integers, 1));
    }
}
