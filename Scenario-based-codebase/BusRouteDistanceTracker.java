import java.util.Scanner;

public class BusRouteDistanceTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalDistance = 0.0;
        int stopNumber = 1;
        boolean journeyOn = true;

        while (journeyOn) {

            System.out.println("\nBus Stop " + stopNumber);
            System.out.print("Enter distance covered to this stop (in km): ");
            double distance = sc.nextDouble();

            totalDistance += distance;

            System.out.println("Total distance traveled: " + totalDistance + " km");

            System.out.print("Do you want to get off at this stop? (y/n): ");
            char choice = sc.next().toLowerCase().charAt(0);

            if (choice == 'y') {
                journeyOn = false;
                System.out.println("\n Passenger got off at stop " + stopNumber);
            } else {
                stopNumber++;
            }
        }

        System.out.println("\n Journey Ended");
        System.out.println("Final distance traveled: " + totalDistance + " km");

        sc.close();
    }
}
