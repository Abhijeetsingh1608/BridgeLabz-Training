package com.gamezone;

import java.util.*;

public class GamerZoneMain {

    public static void main(String[] args) {

        List<Player> leaderboard = new ArrayList<>();

        leaderboard.add(new Player("Alex", 1200));
        leaderboard.add(new Player("John", 900));
        leaderboard.add(new Player("Riya", 1500));
        leaderboard.add(new Player("Sam", 1100));
        leaderboard.add(new Player("Neha", 1300));

        System.out.println("Before Sorting:");
        leaderboard.forEach(System.out::println);

        LeaderboardSorter.quickSort(leaderboard, 0, leaderboard.size() - 1);

        System.out.println("\n🏆 Leaderboard (High to Low):");
        leaderboard.forEach(System.out::println);
    }
}
