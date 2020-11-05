package com.rakovets.course.javabasics.practice.jcf.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCollectionUtilTest {
    private Collection<String> collection;
    StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();
    @Test
    void resetWordsByLengthTest() {
        String[] string = new String[]{"money", "get", "away", "get", "a", "good", "job", "and", "you're", "okay"};
        Collection<String> collection = new ArrayList<>(Arrays.asList(string));
        assertEquals(Arrays.<String>asList("money, *, away, *, a, good, *, *, you're, okay"), (stringCollectionUtil.resetWordsByLength(collection, 3)));
    }

    @Test
    void removeWordsByLengthTest() {
        String[] string1 = new String[]{"money", "get", "back", "I'm", "all", "right", "Jack", "keep", "your", "hands", "off", "my", "stack"};
        Collection<String> collection = new ArrayList<String>(Arrays.asList(string1));
        assertEquals(Arrays.<String>asList("get, back, I'm, all, Jack, keep, your, off, my"), stringCollectionUtil.removeWordsByLength(collection, 5));
    }
}

