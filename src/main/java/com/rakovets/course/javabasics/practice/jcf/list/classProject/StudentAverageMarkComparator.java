package com.rakovets.course.javabasics.practice.jcf.list.classProject;

import java.util.Comparator;

public class StudentAverageMarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student student, Student student1) {
        return student.getAverageAnnualMark() - student1.getAverageAnnualMark();
    }
}
