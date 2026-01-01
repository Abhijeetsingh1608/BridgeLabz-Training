import java.util.*;

public class OnlineQuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;

        // Questions
        String[] questions = {
            "1. Which keyword is used to inherit a class in Java?",
            "2. Which data type is used to store decimal values?",
            "3. What is the size of int in Java?",
            "4. Which loop is guaranteed to run at least once?",
            "5. Which symbol is used for logical AND?"
        };

        // Options
        String[][] options = {
            {"a) implements", "b) extends", "c) inherit", "d) super"},
            {"a) int", "b) double", "c) char", "d) boolean"},
            {"a) 2 bytes", "b) 4 bytes", "c) 8 bytes", "d) Depends on OS"},
            {"a) for", "b) while", "c) do-while", "d) foreach"},
            {"a) &", "b) |", "c) &&", "d) !"}
        };

        // Correct answers
        char[] answers = {'b', 'b', 'b', 'c', 'c'};

        // Quiz Start
        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (a/b/c/d): ");
            char userAnswer = sc.next().toLowerCase().charAt(0);

            // Switch for answer checking
            switch (userAnswer) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                    if (userAnswer == answers[i]) {
                        score++;
                        System.out.println(" Correct Answer!");
                    } else {
                        System.out.println(" Wrong Answer!");
                    }
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        }

        // Final Score
        System.out.println("\n===========================");
        System.out.println("Quiz Completed!");
        System.out.println("Your Score: " + score + " / 5");
        System.out.println("===========================");

        sc.close();
    }
}
