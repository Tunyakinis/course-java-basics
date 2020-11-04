package com.rakovets.course.javabasics.practice.exceptionhandling.task4;

import java.util.Comparator;

public class StudentAverageMarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student student, Student student1) throws MarkValueException {
        if (student.getAverageAnnualMark() < 0 || student1.getAverageAnnualMark() < 0) {
            throw new MarkValueException();
        }
        return student.getAverageAnnualMark() - student1.getAverageAnnualMark();
    }
}
