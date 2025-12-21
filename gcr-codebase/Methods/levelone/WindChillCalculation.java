import java.util.Scanner;
// Create a class WindChillCalculation
public class WindChillCalculation{
    // Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74
                + 0.6215 * temperature
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }
    // Main method
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Take input
        System.out.print("Enter temperature (in Fahrenheit): ");
        double temperature = sc.nextDouble();
        System.out.print("Enter wind speed (in miles per hour): ");
        double windSpeed = sc.nextDouble();
        // Calculate wind chill
        double windChill = calculateWindChill(temperature, windSpeed);

        // Display result
        System.out.println("Wind Chill Temperature = " + windChill);

        sc.close();
    }
}
