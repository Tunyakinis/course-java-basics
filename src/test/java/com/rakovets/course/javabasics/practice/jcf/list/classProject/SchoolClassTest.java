package com.rakovets.course.javabasics.practice.jcf.list.classProject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

public class SchoolClassTest {
    @Test
    void getBestStudentTest() {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Dasha", "Kosarevskaya", 17, 6));
        students.add(new Student("Misha", "Lopachyk", 18, 8));
        students.add(new Student("Dima", "Boris", 19, 7));
        SchoolClass schoolClass = new SchoolClass();
        String bestStudent = schoolClass.getBestStudent(students);
        assertEquals("Misha Lopachyk age: 18 average mark: 8", bestStudent);
    }

    @Test
    void getStudentSortedByAgeTest() {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Dasha", "Kosarevskaya", 17, 6));
        students.add(new Student("Misha", "Lopachyk", 18, 8));
        students.add(new Student("Dima", "Boris", 19, 7));
        SchoolClass schoolClass = new SchoolClass();
        String sortedStudents = schoolClass.getStudentSortedByAge(students);
        assertEquals("[Dasha Kosarevskaya age: 17 average mark: 6, Misha Lopachyk age: 18 average mark: 8, Dima Boris age: 19 average mark: 7]", sortedStudents);
    }

    @Test
    void getStudentSortedByNamePlusLastNameTest() {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Dasha", "Kosarevskaya", 17, 6));
        students.add(new Student("Misha", "Lopachyk", 18, 8));
        students.add(new Student("Dima", "Boris", 19, 7));
        SchoolClass schoolClass = new SchoolClass();
        String sortedStudents = schoolClass.getStudentSortedByNamePlusLastName(students);
        assertEquals("[Dima Boris age: 19 average mark: 7, Dasha Kosarevskaya age: 17 average mark: 6, Misha Lopachyk age: 18 average mark: 8]", sortedStudents);
    }

    @Test
    void getStudentSortedAverageMarkTest() {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Dasha", "Kosarevskaya", 17, 6));
        students.add(new Student("Misha", "Lopachyk", 18, 8));
        students.add(new Student("Dima", "Boris", 19, 7));
        SchoolClass schoolClass = new SchoolClass();
        String sortedStudents = schoolClass.getStudentSortedAverageMark(students);
        assertEquals("[Dasha Kosarevskaya age: 17 average mark: 6, Misha Lopachyk age: 18 average mark: 8, Dima Boris age: 19 average mark: 7]", sortedStudents);
    }
}