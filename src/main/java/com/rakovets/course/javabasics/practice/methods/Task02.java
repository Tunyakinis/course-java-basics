package com.rakovets.course.javabasics.practice.methods;

import com.rakovets.course.javabasics.util.StandardInputTask;

/**
 * Разработать программу для desktop приложения:
 * которая выведет приветствие для пользователя в зависимости от времени суток.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task02 extends StandardInputTask {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
        int hour = INPUT_SCANNER.nextInt();

        getGreetingByHour(hour);
    }

    /**
     * Возвращает приветствие в зависимости от значения часов.
     *
     * @param hour - текущее значение часов (от 0 до 23)
     * @return приветствие согласно шаблону 'Good morning/day/evening/night'
     */
    static String getGreetingByHour(int hour) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        String result = null;
        if (hour > 3 && hour < 12) {
            System.out.println("Good morning");
            result = "Good morning";
        }
        else if (hour > 11 && hour < 16) {
            System.out.println("Good day");
            result = "Good day";
        }
        else if (hour > 15 && hour <= 23) {
            System.out.println("Good evening");
            result = "Good evening";
        }
        else if (hour >= 0 && hour < 4) {
            System.out.println("Good night");
            result = "Good night";
        }
        return result;
    }
}