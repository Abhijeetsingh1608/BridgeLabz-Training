import java.util.Scanner;
//Create a class FizzBuzzWhile to check for a positive integer and print
//"Fizz" and "BUZZ" and also "FIZZBUZZ"
public class FizzBuzzWhile {
    public static void main(String[] args) {
		
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        // Check for positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
        int i=1;
        // FizzBuzz logic using while loop and Display result
        while (i <= number) {
        if (i % 3 == 0 && i % 5 == 0) {
          System.out.println("FizzBuzz");
        } else if (i % 3 == 0) {
          System.out.println("Fizz");
        } else if (i % 5 == 0) {
          System.out.println("Buzz");
        } else {
          System.out.println(i);
        }
          i++; // increment
                }
            }
        }
        sc.close();
    }
}
