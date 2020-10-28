package com.rakovets.course.javabasics.practice.generics;

import java.util.Random;
import java.util.Scanner;

public class Array<T extends Number & Comparable> {

    private Number[] array;
    private int size;

    public Array(int count) {
        array = new Number[count];
        this.size = size;
    }

    public void getKeyboardInputArray() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
    }

    public void getRandomArray() {
        for (int i = 0; i < size; i++) {
            Random random = new Random();
            array[i] = random.nextInt();
        }
    }

    public void printArray() {
        for (Object variable : array) {
            System.out.print(variable);
        }
    }

    public T getMaximumFromArray(T array[]) {
        T maximum = array[0];
        for (T type : array) {
            if (type.compareTo(maximum) > 0) {
                maximum = type;
            }
        }
        return maximum;
    }

    public T getMinimumFromArray(T array[]) {
        T minimum = array[0];
        for (T type : array) {
            if (type.compareTo(minimum) < 0) {
                minimum = type;
            }
        }
        return minimum;
    }

    public double getAverageFromArray(T array[]) {
        double average = 0.0;
        for (int i = 0; i < array.length; i++) {
            average += array[i].doubleValue() / array.length;
        }
        double roundAverage = java.lang.Math.round(average * 100) / 100D;
        return roundAverage;
    }

    public T[] getSortInAscending(T array[]) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    public T[] getSortInDescending(T array[]) {
        getSortInAscending(array);
        for (int i = 0; i < getSize(); i++) {
            for (int j = getSize(); j < 0; j--) {
                array[i] = array[j];
            }
        }
        return array;
    }

    public int getBinarySearch(T array[], T elementToSearch) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        int midIndex = 0;
        int result = 0;
        getSortInAscending(array);
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

    public void changeVariable(T array[], int index, T value) {
        array[index] = value;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
