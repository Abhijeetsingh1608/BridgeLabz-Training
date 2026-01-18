package com.artexpo;

public class ArtExpoMain {

    public static void main(String[] args) {

        Artist[] artists = {
            new Artist(120, "Rahul"),
            new Artist(90, "Anita"),
            new Artist(150, "Vikas"),
            new Artist(110, "Neha")
        };

        ArtExpo expo = new ArtExpo();

        expo.sortArtists(artists);
        expo.displayArtists(artists);
    }
}
