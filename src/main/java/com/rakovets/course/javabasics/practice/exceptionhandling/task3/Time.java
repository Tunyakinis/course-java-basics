package com.rakovets.course.javabasics.practice.exceptionhandling.task3;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

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

    public int getTotalSeconds() throws TimeValueException {
        int totalSeconds = this.seconds + (this.minutes * 60) + (this.hours * 3600);
        if (this.seconds < 0) {
            throw new TimeValueException();
        }
        return totalSeconds;
    }
}

