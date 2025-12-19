// Create a class Handshakes and to calculate the maximum number of handshakes among N students
import java.util.Scanner;
public class Handshakes {
    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner input = new Scanner(System.in);
        // Read the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        // Calculate maximum number of handshakes using combination formula: n*(n-1)/2
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + maxHandshakes);

        // Close the Scanner
        input.close();
    }
}
