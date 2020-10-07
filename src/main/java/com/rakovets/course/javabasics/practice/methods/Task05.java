package com.rakovets.course.javabasics.practice.methods;

import com.rakovets.course.javabasics.util.StandardInputTask;

/**
 * Разработать программу для игрового движка:
 * Игрок при регистрации вводит свою дату рождения и она хранится в формате dd/MM/yyyy. В профиле игрока месяц
 * еобходимо выводить не в числовом формате, а в текстовом. Определить название месяца в зависимости от номера.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task05 extends StandardInputTask {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
        byte monthNumber = INPUT_SCANNER.nextByte();

        getNameMonth(monthNumber);
    }

    /**
     * Возвращает название месяца, в зависимости от его порядкового номера
     *
     * @param monthNumber - номер месяца
     * @return месяц на английском языке (UPPER CASE)
     */
    static String getNameMonth(byte monthNumber) {
        String month = null;
        switch (monthNumber){
            case (1):
                month = "JANUARY";
                System.out.println("JANUARY");
                break;
            case (2):
                month = "FEBRUARY";
                System.out.println("FEBRUARY");
                break;
            case (3):
                month = "MARCH";
                System.out.println("MARCH");
                break;
            case (4):
                month = "APRIL";
                System.out.println("APRIL");
                break;
            case (5):
                month = "MAY";
                System.out.println("MAY");
                break;
            case (6):
                month = "JUNE";
                System.out.println("JUNE");
                break;
            case (7):
                month = "JULY";
                System.out.println("JULY");
                break;
            case (8):
                month = "AUGUST";
                System.out.println("AUGUST");
                break;
            case (9):
                month = "SEPTEMBER";
                System.out.println("SEPTEMBER");
                break;
            case (10):
                month = "OCTOBER";
                System.out.println("OCTOBER");
                break;
            case (11):
                month = "NOVEMBER";
                System.out.println("NOVEMBER");
                break;
            case (12):
                month = "DECEMBER";
                System.out.println("DECEMBER");
                break;
            default:
                System.out.println("error");
                break;
        }
        return month;
    }
}