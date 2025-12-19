import java.util.Scanner;
//Create a class Copy2DArrayTo1D to create a 2D array and copy the
//copy the array into a single dimension array
public class Copy2DArrayTo1D {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        // Take input for number of rows
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        // Take input for number of columns
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        // Create a 2D array (Matrix)
        int[][] matrix = new int[rows][columns];
        // Take user input for matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {          // Outer loop for rows
            for (int j = 0; j < columns; j++) {   // Inner loop for columns
                matrix[i][j] = sc.nextInt();
            }
        }
        // Create a 1D array of size rows * columns
        int[] array = new int[rows * columns];
        // Index variable for 1D array
        int index = 0;
        // Copy elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {          // Loop through rows
            for (int j = 0; j < columns; j++) {   // Loop through columns
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Display the 1D array elements
        System.out.println("\nElements of the 1D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
