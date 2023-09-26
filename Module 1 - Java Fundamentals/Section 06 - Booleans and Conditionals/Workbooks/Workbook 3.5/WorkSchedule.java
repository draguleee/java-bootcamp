/**
 * Workbook 3.5 - Work Schedule
 */

public class WorkSchedule {
    public static void main(String[] args) {
        
        // Assume that da variable can be any value between 1 (Monday) and 7 (Sunday)
        int day = 6;   

        // Boolean variable holiday
        boolean holiday = false;
         
        // Do I have to work that day?
        if(holiday) {
            System.out.println("\nWoohoo, no work!");
        } else if(day == 6 || day == 7) {
            System.out.println("\nIt's weekend, no work!");
        } else {
            System.out.println("\nWake up at 7:00...");
        }
    }
}