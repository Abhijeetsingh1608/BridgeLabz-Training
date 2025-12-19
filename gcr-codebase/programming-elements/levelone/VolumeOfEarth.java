// Create a class to calculate the volume of Earth in km^3 and miles^3
public class VolumeOfEarth {
    public static void main(String[] args) {

        // Create a variable radiusKm
        double radiusKm = 6378;
        // use Pi Value
        double pi = 3.14159;
        // Convert radius from kilometers to miles
        //  as 1 kilometer = 0.621371 miles
		// create a Variable radiusMiles
        double radiusMiles = radiusKm * 0.621371;
        // Create variable volumeKm and calculate Volume of Earth in cubic kilometers
        double volumeKm = (4.0 / 3.0) * pi * radiusKm * radiusKm * radiusKm;
        // Create variable volumeMiles and Calculate Volume of Earth in cubic miles
        double volumeMiles = (4.0 / 3.0) * pi * radiusMiles * radiusMiles * radiusMiles;

        // Display the result
        System.out.println(
            "The volume of earth in cubic kilometers is " + volumeKm +
            " and cubic miles is " + volumeMiles
        );
    }
}
