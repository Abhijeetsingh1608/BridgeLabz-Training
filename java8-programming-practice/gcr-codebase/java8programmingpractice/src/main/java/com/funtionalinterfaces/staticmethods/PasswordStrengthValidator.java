package com.funtionalinterfaces.staticmethods;

public class PasswordStrengthValidator {

    interface SecurityUtils {
        static boolean isStrongPassword(String password) {
            if (password.length() < 8) return false;

            boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) hasUpper = true;
                else if (Character.isLowerCase(ch)) hasLower = true;
                else if (Character.isDigit(ch)) hasDigit = true;
                else hasSpecial = true;
            }
            return hasUpper && hasLower && hasDigit && hasSpecial;
        }
    }

    public static void main(String[] args) {
        String password1 = "StrongP@ss1";
        String password2 = "weakpass";

        System.out.println("Password 1 strong? " +
                SecurityUtils.isStrongPassword(password1));

        System.out.println("Password 2 strong? " +
                SecurityUtils.isStrongPassword(password2));
    }
}
