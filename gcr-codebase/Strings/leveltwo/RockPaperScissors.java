import java.util.*;
//Create a class RockPaperScissors
public class RockPaperScissors {
    // Method to get computer choice randomly
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); 
        switch (choice) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "rock";
        }
    }
    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        }
        if (userChoice.equals("rock")) {
            return (computerChoice.equals("scissors")) ? "User" : "Computer";
        } else if (userChoice.equals("paper")) {
            return (computerChoice.equals("rock")) ? "User" : "Computer";
        } else if (userChoice.equals("scissors")) {
            return (computerChoice.equals("paper")) ? "User" : "Computer";
        } else {
            return "Invalid";
        }
    }

    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][2];
		
        double userPercentage = (userWins * 100.0) / totalGames;
        double computerPercentage = (computerWins * 100.0) / totalGames;

        stats[0][0] = "User Wins: " + userWins;
        stats[0][1] = String.format("Winning %: %.2f%%", userPercentage);

        stats[1][0] = "Computer Wins: " + computerWins;
        stats[1][1] = String.format("Winning %: %.2f%%", computerPercentage);

        return stats;
    }
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\tComputer\tWinner");
        System.out.println("------------------------------------------");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" + gameResults[i][0] + "\t" + gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }
        System.out.println("\nStatistics:");
        System.out.println("Player\t\tWins/Percentage");
        System.out.println(" ");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1]);
        }
    }
    // Main method
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Input number of games
        System.out.print("Enter number of games to play: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        String[][] gameResults = new String[n][3]; // [userChoice, computerChoice, winner]
        int userWins = 0;
        int computerWins = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("\nGame " + (i + 1) + " - Enter your choice (rock/paper/scissors): ");
            String userChoice = sc.nextLine().toLowerCase();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }
            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }
        // Calculate statistics
        String[][] stats = calculateStats(userWins, computerWins, n);

        // Display results
        displayResults(gameResults, stats);

        sc.close();
    }
}
