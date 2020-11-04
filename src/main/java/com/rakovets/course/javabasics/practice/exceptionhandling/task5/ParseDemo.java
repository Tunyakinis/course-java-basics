package com.rakovets.course.javabasics.practice.exceptionhandling.task5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseDemo {
    public static void main(String[] args) throws ParseDateException {
        String string = "2020 11 04";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        try {
            try {
                date = dateFormat.parse(string);
                System.out.println(date);
            } catch (java.text.ParseException e) {
                e.printStackTrace(System.out);
                throw new ParseDateException(e.getMessage());
            }
        } catch (ParseDateException e) {
            e.printStackTrace(System.out);
        }
    }
}