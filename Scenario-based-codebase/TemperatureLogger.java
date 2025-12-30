import java.util.*;
public class TemperatureLogger {
    public static void recordTemperatures(double[] temperatures) {
        Scanner scanner = new Scanner(System.in);
        for (int day = 0; day < temperatures.length; day++) {
            System.out.print("Enter temperature for Day " + (day + 1) + ": ");
            temperatures[day] = scanner.nextDouble();
        }
    }
    public static double calculateAverage(double[] temperatures) {
        double sum = 0;
        for (int i = 0; i < temperatures.length; i++) {
            sum += temperatures[i];
        }
        return sum / temperatures.length;
    }
	
    public static double findMaxTemperature(double[] temperatures) {
        double maxTemperature = temperatures[0];

        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > maxTemperature) {
                maxTemperature = temperatures[i];
            }
        }
        return maxTemperature;
    }

    public static void main(String[] args) {
        double[] weeklyTemperatures = new double[7];
        recordTemperatures(weeklyTemperatures);
        double averageTemperature = calculateAverage(weeklyTemperatures);
        double maxTemperature = findMaxTemperature(weeklyTemperatures);

        System.out.println("\n--- Temperature Report ---");
        System.out.println("Average Temperature: " + averageTemperature);
        System.out.println("Maximum Temperature: " + maxTemperature);
    }
}
