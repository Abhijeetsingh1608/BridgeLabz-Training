import java.util.Scanner;
//Create a class SumUntilZero to find the sum of numbers
public class SumUntilZero {
    public static void main(String[] args) {
        
		//Create a Scanner object
        Scanner sc = new Scanner(System.in);
        double total = 0.0;      // stores the sum
        double number;           // stores user input
		//Input
        System.out.print("Enter a number : ");
        number = sc.nextDouble();
        // Using While Loop
        while (number != 0) {
            total = total + number;
            System.out.print("Enter a number: ");
            number = sc.nextDouble();
        }

        // Display result
        System.out.println("Total sum = " + total);

        sc.close();
    }
}
