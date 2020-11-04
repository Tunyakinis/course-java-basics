package com.rakovets.course.javabasics.practice.exceptionhandling.task4;

public class StudentDemo {
    public static void main(String[] args) {
        StudentAverageMarkComparator studentAverageMarkComparator = new StudentAverageMarkComparator();
        Student student = new Student("Vasya", "Pupkin", 25, -1);
        Student student1 = new Student("Dasha", "Kosarevskaya", 20, 5);
        try {
            studentAverageMarkComparator.compare(student, student1);
        } catch (MarkValueException e) {
            e.printStackTrace(System.out);
        }
    }
}