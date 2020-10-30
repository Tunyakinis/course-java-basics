package com.rakovets.course.javabasics.practice.jcf.list.classProject;

import java.util.LinkedList;

public class SchoolClass {
    private LinkedList<Student> students;

    public String getBestStudent(LinkedList<Student> students) {
        students.sort(new StudentAverageMarkComparator());
        return students.getLast().toString();
    }

    public String getStudentSortedByAge(LinkedList<Student> students) {
        students.sort(new StudentAgeComparator());
        return students.toString();
    }

    public String getStudentSortedByNamePlusLastName(LinkedList<Student> students) {
        students.sort(new StudentNamePlusLastNameComparator());
        return students.toString();
    }

    public String getStudentSortedAverageMark(LinkedList<Student> students) {
        students.sort(new StudentAgeComparator());
        return students.toString();
    }
}
