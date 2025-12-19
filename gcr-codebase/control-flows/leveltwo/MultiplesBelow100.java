import java.util.Scanner;
//Create a class MultiplesBeloe100 to find all the multiples of a
//number below 100
public class MultiplesBelow100 {
    public static void main(String[] args) {
		
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Get user input
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();
        // Check for valid input
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");

        // Loop backward from 100 to 1
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);//Display result
                }
            }
        }
        sc.close();
    }
}
