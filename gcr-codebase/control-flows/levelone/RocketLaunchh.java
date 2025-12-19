import java.util.Scanner;
//Create a class RocketLaunch to count down the number from user
//input value to 1
public class RocketLaunch {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Take user input
        System.out.print("Enter countdown number: ");
        int counter = sc.nextInt();
        //using while loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        //Display the reasult
        System.out.println("Rocket Launch!");

        sc.close();
    }
}
