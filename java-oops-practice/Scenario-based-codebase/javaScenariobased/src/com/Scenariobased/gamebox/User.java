package com.Scenariobased.gamebox;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private List<Game> ownedGames;   // encapsulated

    public User(String username) {
        this.username = username;
        this.ownedGames = new ArrayList<>();
    }

    public void buyGame(Game game) {
        ownedGames.add(game);
        System.out.println(username + " purchased " + game.title);
    }

    public void showOwnedGames() {
        System.out.println("Games owned by " + username + ":");
        for (Game g : ownedGames) {
            System.out.println("- " + g.title + " (" + g.genre + ")");
        }
    }
}
