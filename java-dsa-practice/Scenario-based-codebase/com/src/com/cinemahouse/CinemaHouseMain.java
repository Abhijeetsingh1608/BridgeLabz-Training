package com.cinemahouse;

public class CinemaHouseMain {

    public static void main(String[] args) {

        MovieShow[] shows = {
            new MovieShow(180),  // 3:00 PM
            new MovieShow(120),  // 2:00 PM
            new MovieShow(240),  // 4:00 PM
            new MovieShow(150)   // 2:30 PM
        };

        CinemaHouse cinema = new CinemaHouse();

        cinema.sortShows(shows);
        cinema.displayShows(shows);
    }
}
