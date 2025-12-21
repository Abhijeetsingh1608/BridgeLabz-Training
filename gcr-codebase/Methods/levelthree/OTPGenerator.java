import java.util.*;
//Create a class OTPGenerator to generate and validate the OTPs
public class OTPGenerator {
    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        // Generates a number between 100000 and 999999
        return (int)(Math.random() * 900000) + 100000;
    }
    // Method to check whether all OTPs in the array are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true;
    }
    // Main method
    public static void main(String[] args) {
        int[] otps = new int[10];
        // Generate OTPs 10 times
        System.out.println("Generated OTPs:");
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println(otps[i]);
        }
        // Validate uniqueness
        if (areOTPsUnique(otps)) {
            System.out.println("All OTPs are UNIQUE ✅");
        } else {
            System.out.println("Duplicate OTPs found ❌");
        }
    }
}
