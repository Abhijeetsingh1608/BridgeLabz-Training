import java.util.*;
//Create a class RandomNumbers to find average values,and their 
//minimum and maximum value
public class RandomNumbers{
	//Create method
	public static int[] generate4DigitRandomArray(int size){
		int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }
        return arr;
	}
	public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }
	//Calling main
	public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);
        double[] result = findAverageMinMax(randomNumbers);

        System.out.println("Random Numbers:");
        for (int n : randomNumbers) {
            System.out.print(n + " ");
        }

        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }

}