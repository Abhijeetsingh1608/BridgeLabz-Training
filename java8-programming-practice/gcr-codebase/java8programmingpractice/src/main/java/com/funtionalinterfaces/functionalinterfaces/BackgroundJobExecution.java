package com.funtionalinterfaces.functionalinterfaces;

public class BackgroundJobExecution {

    interface BackgroundJob {
        void execute();
    }

    static class DataBackupJob implements BackgroundJob {
        @Override
        public void execute() {
            System.out.println("Executing data backup job...");
            // Simulate backup process
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Data backup completed.");
        }
    }

    static class EmailNotificationJob implements BackgroundJob {
        @Override
        public void execute() {
            System.out.println("Sending email notifications...");
            // Simulate email sending process
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Email notifications sent.");
        }
    }

    public static void main(String[] args) {
        BackgroundJob backupJob = new DataBackupJob();
        BackgroundJob emailJob = new EmailNotificationJob();

        Thread backupThread = new Thread(() -> backupJob.execute());
        Thread emailThread = new Thread(() -> emailJob.execute());

        backupThread.start();
        emailThread.start();

        try {
            backupThread.join();
            emailThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
