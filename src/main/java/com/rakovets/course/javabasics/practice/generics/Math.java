package com.rakovets.course.javabasics.practice.generics;

import java.util.LinkedList;

public class Math<T extends Number & Comparable> {

    public T getMaximumOfType(T type1, T type2, T type3) {
        LinkedList<T> array = new LinkedList<>();
        array.add(type1);
        array.add(type2);
        array.add(type3);
        T maximum = array.getFirst();
        for (int i = 1; i < array.size(); i++) {
            if (maximum.doubleValue() < array.get(i).doubleValue()) {
                maximum = array.get(i);
            }
        }
        return maximum;
    }

    public T getMaximumOfType(T type1, T type2, T type3, T type4, T type5) {

        LinkedList<T> array = new LinkedList<>();
        array.add(type1);
        array.add(type2);
        array.add(type3);
        array.add(type4);
        array.add(type5);
        T minimum = array.getFirst();
        for (int i = 1; i < array.size(); i++) {
            if (minimum.doubleValue() > array.get(i).doubleValue()) {
                minimum = array.get(i);
            }
        }
        return minimum;
    }

    public double getAverageFromArray(T[] array) {
        double average = 0.0;
        for (int i = 0; i < array.length; i++) {
            average += array[i].doubleValue() / array.length;
        }
        double roundAverage = java.lang.Math.round(average * 100) / 100D;
        return roundAverage;
    }

    public T getMaximumFromArray(T[] array) {
        T maximum = array[0];
        for (T type : array) {
            if (type.compareTo(maximum) > 0) {
                maximum = type;
            }
        }
        return maximum;
    }

    public T getMinimumFromArray(T[] array) {

        T minimum = array[0];
        for (T type : array) {
            if (type.compareTo(minimum) < 0) {
                minimum = type;
            }
        }
        return minimum;
    }

    public T[] getArraySort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < (array.length - 1); j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temple = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temple;
                }
            }
        }
        return array;
    }

    public int getBinarySearch(T[] array, T elementToSearch) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        int midIndex = 0;
        int result = 0;
        getArraySort(array);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < (array.length - 1); j++) {
                if ((array[j].compareTo(array[j + 1])) > 0) {
                    T variable = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = variable;
                }
            }
            if (array.length == 0) {
                result = -1;
            } else {
                while (firstIndex <= lastIndex) {
                    midIndex = firstIndex + (lastIndex - firstIndex) / 2;
                    if (array[midIndex].compareTo(elementToSearch) == 0) {
                        result = midIndex;
                        break;
                    } else if (array[midIndex].compareTo(elementToSearch) > 0) {
                        lastIndex = midIndex - 1;
                    } else {
                        firstIndex = midIndex + 1;
                    }
                    if (firstIndex > lastIndex) {
                        result = -1;
                    }
                }
            }
        }
        return result;
    }
}

