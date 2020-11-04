package com.rakovets.course.javabasics.practice.exceptionhandling.task7;

public class WinOrLoose {
    public boolean WinOrLose(RouletteRoll rouletteRoll, int a) throws Exception {
        if (rouletteRoll.getValue() != a) {
            throw new Exception();
        }
        System.out.println("You win");
        return true;
    }
}

