package com.rakovets.course.javabasics.practice.jcf.list.classProject;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student student, Student student1) {
        return student.getAge() - student1.getAge();
    }
}
