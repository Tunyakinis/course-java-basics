package com.rakovets.course.javabasics.practice.methods;

import com.rakovets.course.javabasics.util.StandardInputTask;

/**
 * Разработать программу для desktop приложения:
 * которая преобразует номер дня недели в его словесный аналог.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task04 extends StandardInputTask {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
        byte weekdayNumber = INPUT_SCANNER.nextByte();
        getNameWeekday(weekdayNumber);
    }

    /**
     * Возвращает название дня недели, в зависимости от его порядкового номера.
     *
     * @param weekdayNumber - номер дня недели
     * @return день недели на английском языке (UPPER CASE)
     */
    static String getNameWeekday(byte weekdayNumber) {
        String dayOfWeek = null;
        switch (weekdayNumber){
            case (1):
                dayOfWeek = "MONDAY";
                System.out.println("MONDAY");
                break;
            case (2):
                dayOfWeek = "TUESDAY";
                System.out.println("TUESDAY");
                break;
            case (3):
                dayOfWeek = "WEDNESDAY";
                System.out.println("WEDNESDAY");
                break;
            case (4):
                System.out.println("THURSDAY");
                dayOfWeek = "THURSDAY";
                break;
            case (5):
                System.out.println("FRIDAY");
                dayOfWeek = "FRIDAY";
                break;
            case (6):
                System.out.println("SATURDAY");
                dayOfWeek = "SATURDAY";
                break;
            case (7):
                System.out.println("SUNDAY");
                dayOfWeek = "SUNDAY";
                break;
            default:
                System.out.println("error");
                break;
        }
        return dayOfWeek;
    }
}