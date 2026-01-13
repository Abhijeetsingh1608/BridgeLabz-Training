package com.Scenariobased.gamebox;

public class GameBoxMain {

    public static void main(String[] args) {

        Game game1 = new ArcadeGame("Speed Racer", 299, 4.5);
        Game game2 = new StrategyGame("War Tactics", 499, 4.7);

        User user = new User("Abhijeet");

        game1.playDemo();
        game2.playDemo();

        game2.applyDiscount(20);   // seasonal offer

        user.buyGame(game1);
        user.buyGame(game2);

        game1.download();
        game2.download();

        user.showOwnedGames();
    }
}
