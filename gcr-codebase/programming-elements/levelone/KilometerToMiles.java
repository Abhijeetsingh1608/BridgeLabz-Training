//Create a class KilometerToMiles to convert kilometers to miles
public class KilometerToMiles {
    public static void main(String[] args) {

        // Distance in kilometers
        double kilometers = 10.8;

        // Create a variable milesPerKm
        double milesPerKm = 1.6;

        // Convert kilometers to miles
        double miles = kilometers * milesPerKm;

        // Display the result
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}
