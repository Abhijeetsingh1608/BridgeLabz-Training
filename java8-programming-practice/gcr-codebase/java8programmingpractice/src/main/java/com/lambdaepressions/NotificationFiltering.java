package com.lambdaepressions;

import java.util.*;

public class NotificationFiltering {

    interface Notification {
        String getType();
        String getMessage();
    }

    static class Alert implements Notification {
        private String type;
        private String message;

        public Alert(String type, String message) {
            this.type = type;
            this.message = message;
        }

        public String getType() { return type; }
        public String getMessage() { return message; }
    }

    public static void main(String[] args) {

        List<Alert> notifications = Arrays.asList(
            new Alert("Email", "You've got a new email!"),
            new Alert("SMS", "New SMS received."),
            new Alert("Push", "New push notification.")
        );

        System.out.println("Email Notifications:");
        notifications.stream()
            .filter(n -> n.getType().equals("Email"))
            .forEach(n -> System.out.println(n.getMessage()));

        System.out.println("\nSMS Notifications:");
        notifications.stream()
            .filter(n -> n.getType().equals("SMS"))
            .forEach(n -> System.out.println(n.getMessage()));
    }
}
