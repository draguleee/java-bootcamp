/**
 * Workbook 6.7 - Ring Announcer
 */

public class RingAnnouncer {
    public static void main(String[] args) {

        // Store a fight record 
        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
        
        // Count the number of wins and losses
        int wins = 0;
        int losses = 0;
        for (int i = 0; i < record.length; i++) {
            if (record[i].equals("WIN")) {
                wins++;
            } else {
                losses++;
            }
        }
        
        System.out.println("\nWith a professional record of " + wins + " wins and " + losses + " losses.");
        System.out.println("He is the pride of Oracle: Java Fury!");


    }
}
