public class FitnessChallengeTracker {
    public static void main(String[] args) {
        int[] dailyPushUps = {30, 0, 25, 40, 0, 35, 20};
        int totalPushUps = 0;
        int activeDays = 0;

        for (int pushUps : dailyPushUps) {
            if (pushUps == 0) {
                continue;
            }

            totalPushUps += pushUps;
            activeDays++;
        }

        double averagePushUps = (double) totalPushUps / activeDays;

        System.out.println(" Sandeep’s Fitness Challenge Report");
        System.out.println("Total Push-ups in a Week: " + totalPushUps);
        System.out.println("Average Push-ups per Active Day: " + averagePushUps);
    }
}
