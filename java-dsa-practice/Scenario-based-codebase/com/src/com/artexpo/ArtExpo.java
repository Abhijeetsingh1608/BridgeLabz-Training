package com.artexpo;

class ArtExpo {

    void sortArtists(Artist[] artists) {

        for (int i = 1; i < artists.length; i++) {

            Artist key = artists[i];
            int j = i - 1;

            // Shift artists who registered later
            while (j >= 0 && artists[j].regTime > key.regTime) {
                artists[j + 1] = artists[j];
                j--;
            }

            // Insert artist at correct time position
            artists[j + 1] = key;
        }
    }

    void displayArtists(Artist[] artists) {
        for (Artist a : artists) {
            System.out.println(a.regTime + " - " + a.name);
        }
    }
}
