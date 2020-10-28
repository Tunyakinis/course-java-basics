package com.rakovets.course.javabasics.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PairUtilTest {
    @Test
    void swapTest() {
        PairUtil<String, Integer> stringIntegerPairUtil = new PairUtil<>();
        Pair<String, Integer> origin = new Pair<>("Come on", 3);
        Pair<Integer, String> swapped = stringIntegerPairUtil.swap(origin);
        Assertions.assertEquals(origin.getFirst(), swapped.getSecond());
        Assertions.assertEquals(origin.getSecond(), swapped.getFirst());
    }
}
