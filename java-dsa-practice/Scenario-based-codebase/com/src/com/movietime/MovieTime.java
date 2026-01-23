package com.movietime;

import java.util.ArrayList;

public class MovieTime {

    private ArrayList<Show> shows = new ArrayList<>();

    // Insert show in sorted order using Insertion Sort logic
    public void addShow(Show newShow) {
        int i = shows.size() - 1;

        // Shift elements greater than new show time
        while (i >= 0 && shows.get(i).getTime() > newShow.getTime()) {
            i--;
        }

        shows.add(i + 1, newShow);
        System.out.println("🎟 Added: " + newShow);
    }

    public void displayShows() {
        System.out.println("\n📽 Upcoming Shows:");
        for (Show show : shows) {
            System.out.println(show);
        }
    }
}
