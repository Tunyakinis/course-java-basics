package com.rakovets.course.javabasics.practice.exceptionhandling.task7;

import java.util.Random;
import java.util.Scanner;

public class RouletteRollDemo {
    public static void main(String[] args) {
        Random random = new Random();
        WinOrLoose winOrLoose = new WinOrLoose();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Make your bet");
        int number = scanner.nextInt();
        RouletteRoll rouletteRoll = new RouletteRoll(random.nextInt(2));
        System.out.println(rouletteRoll.toString());
        try {
            winOrLoose.WinOrLose(rouletteRoll, number);
        } catch (Exception e) {
            System.out.println("You loose");
        } finally {
            System.out.println("Make new bet");
        }
    }
}
