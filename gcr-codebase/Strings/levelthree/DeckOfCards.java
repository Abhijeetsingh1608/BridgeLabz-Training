import java.util.Scanner;
//Create a class DeckOfCards
public class DeckOfCards {
    // Methods
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }

        return deck;
    }
    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }
    public static String[][] distributeCards(String[] deck, int nCards, int players) {
        if (nCards % players != 0) {
            System.out.println("Cards cannot be evenly distributed among players.");
            return null;
        }
        int cardsPerPlayer = nCards / players;
        String[][] result = new String[players][cardsPerPlayer];

        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                result[i][j] = deck[index];
                index++;
            }
        }

        return result;
    }
    public static void printPlayers(String[][] players) {

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
            System.out.println();
        }
    }
    // Main method
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace"};
        String[] deck = initializeDeck(suits, ranks);
        deck = shuffleDeck(deck);
        System.out.print("Enter number of cards to distribute: ");
        int nCards = sc.nextInt();
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        if (nCards > deck.length) {
            System.out.println("Not enough cards in the deck.");
        } else {
            String[][] distributed = distributeCards(deck, nCards, players);
            if (distributed != null) {
                printPlayers(distributed);
            }
        }

        sc.close();
    }
}
