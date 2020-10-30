package com.rakovets.course.javabasics.practice.jcf.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class StringCollectionUtilTest {
    @Test
    void resetWordsByLengthTest() {
        String[] string = new String[]{"money", "get", "away", "get", "a", "good", "job", "and", "you're", "okay"};
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < string.length; i++) {
            arrayList.add(string[i]);
        }
        StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();
        ArrayList<String> result = stringCollectionUtil.resetWordsByLength(arrayList, 3);
        Assertions.assertEquals("[money, *, away, *, a, good, *, *, you're, okay]", result.toString());

    }

    @Test
    void removeWordsByLengthTest() {
        String[] string1 = new String[]{"money", "get", "back", "I'm", "all", "right", "Jack", "keep", "your", "hands", "off", "my", "stack"};
        ArrayList<String> arrayList = new ArrayList<>();
        for (String string : string1) {
            arrayList.add(string);
        }
        StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();
        ArrayList<String> result = stringCollectionUtil.removeWordsByLength(arrayList, 5);
        Assertions.assertEquals("[get, back, I'm, all, Jack, keep, your, off, my]", result.toString());
    }
}

