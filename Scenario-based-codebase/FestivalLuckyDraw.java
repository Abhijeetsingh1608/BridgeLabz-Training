import java.util.Scanner;

public class FestivalLuckyDraw {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of visitors: ");
        int visitors = sc.nextInt();

        for (int i = 1; i <= visitors; i++) {

            System.out.println("\nVisitor " + i);
            System.out.print("Draw a number: ");
            int number = sc.nextInt();

            // Invalid input check
            if (number <= 0) {
                System.out.println(" Invalid number! Try next visitor.");
                continue;
            }

            // Lucky draw condition
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(" Congratulations! You won a Diwali Gift 🎁");
            } else {
                System.out.println(" Sorry! Better luck next time.");
            }
        }

        System.out.println("\n Diwali Lucky Draw Finished ✨");
        sc.close();
    }
}
