import java.util.*;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 100) + 1;

        int guess;
        int attempts = 0;
        System.out.println("Guess the number between 1 and 100m");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;
            if (guess > secretNumber) {
                System.out.println("Too high!");
            } else if (guess < secretNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("🎉 Correct! You guessed the number.");
                System.out.println("Total attempts: " + attempts);
            }

        } while (guess != secretNumber);

        sc.close();
    }
}
