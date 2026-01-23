package com.movietime;

public class MovieTimeMain {

    public static void main(String[] args) {

        MovieTime theater = new MovieTime();
        
        theater.addShow(new Show("Avengers", 600)); // 10:00
        theater.addShow(new Show("Inception", 720)); // 12:00
        theater.addShow(new Show("Interstellar", 840)); // 14:00

        theater.addShow(new Show("Batman", 780)); // 13:00
        theater.displayShows();
    }
}
