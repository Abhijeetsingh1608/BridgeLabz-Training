package com.movietime;

public class Show {
    private String movieName;
    private int time; // minutes from 00:00

    public Show(String movieName, int time) {
        this.movieName = movieName;
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        int hours = time / 60;
        int minutes = time % 60;
        return movieName + " at " +
               String.format("%02d:%02d", hours, minutes);
    }
}
