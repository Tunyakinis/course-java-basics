package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для сайта посвященного астрологии:
 * Которая выводит знак зодиака и названия года по китайскому календарю, если известно:
 *
 * @param day   - число дня рождения
 * @param month - месяц дня рождения
 * @param year  - год дня рождения
 * @return 'Zodiac Sign: {0}. Chinese Zodiac: {1}', где {0} - знак зодиака, {1} - год зодиака
 */
public class Task12 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int day = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[0]);
        int month = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[1]);
        int year = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[2]);
        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        String zodiacSign = "Zodiac Sign:";
        String chineseSign = " Chinese Zodiac:";
        if ((month == 1 && day <= 20) || (month == 12 && day >=22)) {
            System.out.print(zodiacSign + " Sea-Goat.");
        }
        else if ((month == 2 && day <= 20) || (month == 1 && day >=21)) {
            System.out.print(zodiacSign + " Water-Bearer.");;
        }
        else if ((month == 3 && day <= 20) || (month == 2 && day >=21)){
            System.out.print(zodiacSign + " Fishes.");
            }
        else if ((month == 4 && day <= 20) || (month == 3 && day >=21)) {
            System.out.print(zodiacSign + " Ram.");
        }
        else if ((month == 5 && day <= 20) || (month == 4 && day >=21)){
            System.out.print(zodiacSign + " Bull.");
        }
        else if ((month == 6 && day <= 21) || (month == 5 && day >=21)) {
            System.out.print(zodiacSign + " Twins.");
        }
        else if ((month == 7 && day <= 22) || (month == 6 && day >=22)) {
            System.out.print(zodiacSign + " Crab.");
        }
        else if ((month == 8 && day <= 23) || (month == 7 && day >=23)) {
            System.out.print(zodiacSign + " Lion.");
        }
        else if ((month == 9 && day <= 23) || (month == 8 && day >=24)) {
            System.out.print(zodiacSign + " Maiden.");
        }
        else if ((month == 10 && day <= 22) || (month == 9 && day >=24)) {
            System.out.print(zodiacSign + " Scales.");
        }
        else if ((month == 11 && day <= 22) || (month == 10 && day >=23)) {
            System.out.print(zodiacSign + " Scorpion.");
        }
        else if ((month == 12 && day <= 21) || (month == 11 && day >=23)) {
            System.out.print(zodiacSign + " Archer.");
        }
        if ((year - 1900) % 12 == 0) {
            System.out.print(chineseSign + " Rat");
        }
        else if ((year - 1901) % 12 == 0)
            System.out.print(chineseSign + " Ox");
        else if ((year - 1902) % 12 == 0)
            System.out.print(chineseSign + " Tiger");
        else if ((year - 1903) % 12 == 0)
            System.out.print(chineseSign + " Rabbit");
        else if ((year - 1904) % 12 == 0)
            System.out.print(chineseSign + " Dragon");
        else if ((year - 1905) % 12 == 0)
            System.out.print(chineseSign + " Snake");
        else if ((year - 1906) % 12 == 0)
            System.out.print(chineseSign + " Horse");
        else if ((year - 1907) % 12 == 0)
            System.out.print(chineseSign + " Ram");
        else if ((year - 1908) % 12 == 0)
            System.out.print(chineseSign + " Monkey");
        else if ((year - 1909) % 12 == 0)
            System.out.print(chineseSign + " Rooster");
        else if ((year - 1910) % 12 == 0)
            System.out.print(chineseSign + " Dog");
        else if ((year - 1911) % 12 == 0)
            System.out.print(chineseSign + " Pig");
    }
}