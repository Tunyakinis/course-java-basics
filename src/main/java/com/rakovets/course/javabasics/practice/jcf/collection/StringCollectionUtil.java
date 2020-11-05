package com.rakovets.course.javabasics.practice.jcf.collection;

import java.util.ArrayList;
import java.util.Collection;

public class StringCollectionUtil {
    public static Collection<String> resetWordsByLength(Collection<String> collection, int wordsLength) {
        Collection<String> newCollection = new ArrayList<>();
        for (String string : collection) {
            if (string.length() != wordsLength) {
                newCollection.add(string);
            } else {
                newCollection.add("*");
            }
        }
        return newCollection;
    }

    public static Collection<String> removeWordsByLength(Collection<String> collection, int wordsLength) {
        Collection<String> newCollection = new ArrayList<>();
        for (String string : collection) {
            if (string.length() != wordsLength) {
                newCollection.add(string);
            }
        }
        return newCollection;
    }
}
