package com.rakovets.course.javabasics.practice.jcf.list.classProject;

import java.util.Comparator;

public class StudentNamePlusLastNameComparator implements Comparator<Student> {
    public int compare(Student student, Student student1) {
        var result = student.getSurname().compareTo(student1.getSurname());
        if (result == 0) {
            return student.getName().compareTo(student1.getName());
        }else{
            return result;
        }
    }
}
