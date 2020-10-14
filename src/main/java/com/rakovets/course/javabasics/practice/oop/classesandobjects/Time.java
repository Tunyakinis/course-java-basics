package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int totalSeconds) {
        this.hours = totalSeconds;
    }

    public Time(int hour, int minutes, int seconds) {
        this.hours = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hour) {
        this.hours = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getTotalSeconds() {
        int totalSeconds = this.seconds + (this.minutes * 60) + (this.hours * 3600);
        return totalSeconds;
    }
}