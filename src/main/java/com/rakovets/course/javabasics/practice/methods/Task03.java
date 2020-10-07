package com.rakovets.course.javabasics.practice.methods;

import com.rakovets.course.javabasics.util.StandardInputTask;

/**
 * Разработать программу для игрового движка:
 * Необходимо окрасить шкалу HP игрока в соответствующий цвет, в зависимости от процентного соотношения максимального
 * количества HP и текущего.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task03 extends StandardInputTask {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
        int currentHealthPoint = INPUT_SCANNER.nextInt();
        int maxHealthPoint = INPUT_SCANNER.nextInt();

        getColorHealthPoint(currentHealthPoint, maxHealthPoint);
    }

    /**
     * Возвращает цвет для шкалы HP игрока, в зависимости от процентного соотношения максимального количества HP и
     * текущего. Когда меньше 25% - красный, меньше 50% - оранжевый, меньше 75% - желтый, меньше либо равно 100 -
     * зеленый.
     *
     * @param currentHealthPoint текущее количество HP игрока
     * @param maxHealthPoint     - максимальное количество HP игрока
     * @return null/'RED'/'ORANGE'/'YELLOW'/'GREEN'
     */
    static String getColorHealthPoint(int currentHealthPoint, int maxHealthPoint) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        String result = null;
        int healthPercentage = currentHealthPoint*100/maxHealthPoint;
        if (currentHealthPoint <= maxHealthPoint && currentHealthPoint > 0) {
            if(healthPercentage <= 100 && healthPercentage >=75){
                System.out.println("GREEN");
                result = "GREEN";
            }
            else if(healthPercentage < 75 && healthPercentage >= 50){
                System.out.println("YELLOW");
                result = "YELLOW";
            }
            else if(healthPercentage < 50 && healthPercentage >= 25){
                System.out.println("ORANGE");
                result = "ORANGE";
            }
            else if(healthPercentage < 25 && healthPercentage >= 0){
                System.out.println("RED");
                result = "RED";
            }
        }
        return result;
    }
}