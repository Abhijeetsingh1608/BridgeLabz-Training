package com.funtionalinterfaces.markerinterface;

public class SensitiveDataTagging {

    // Marker interface
    interface SensitiveData {
    }

    // Class implementing the marker interface
    static class PersonalInfo implements SensitiveData {
        String name;
        String ssn;

        PersonalInfo(String name, String ssn) {
            this.name = name;
            this.ssn = ssn;
        }
    }

    // Class implementing the marker interface
    static class FinancialRecord implements SensitiveData {
        String accountNumber;
        double balance;

        FinancialRecord(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
    }

    // Encryption processor that checks for SensitiveData interface
    static class EncryptionProcessor {
        void encryptIfSensitive(Object obj) {
            if (obj instanceof SensitiveData) {
                System.out.println("Encrypting: " + obj.getClass().getSimpleName());
            } else {
                System.out.println("No encryption needed for: " + obj.getClass().getSimpleName());
            }
        }
    }
}
