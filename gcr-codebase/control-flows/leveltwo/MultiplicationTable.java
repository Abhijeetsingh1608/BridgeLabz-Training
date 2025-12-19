import java.util.Scanner;
//Create a class MultiplicationTable to find the multiplication table of a number 
//from 6 to 9
public class MultiplicationTable {
    public static void main(String[] args) {
	
        //Create a Scanner object 
        Scanner sc = new Scanner(System.in);
        // Take integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Print multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        sc.close();
    }
}
