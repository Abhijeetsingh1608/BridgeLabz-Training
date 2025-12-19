import java.util.Scanner;
//Create a class SumUntilZero to find the sum of numbers
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        
		//Create a Scanner object
        Scanner sc = new Scanner(System.in);
        double total = 0.0;      // stores the sum
        //Using While loop
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = sc.nextDouble();
            // Break condition
            if (number <= 0) {
                break;
            }
            // Add to total
            total = total + number;
        }       
   
        // Display result
        System.out.println("Total sum = " + total);

        sc.close();
    }
}
