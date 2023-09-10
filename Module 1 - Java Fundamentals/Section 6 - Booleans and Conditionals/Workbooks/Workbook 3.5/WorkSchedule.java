import java.util.Scanner;

/**
 * Workbook 3.5 - Work Schedule
 * 
 * Asuume that day can be any value between 1 (Monday) and 7 (Sunday).
 * There is also a boolean variable: holiday.
 */

public class WorkSchedule {
    public static void main(String[] args) {
        
        // Create the Scanner
        Scanner in = new Scanner(System.in);

        // Determine the day of the week
        System.out.print("Day of the week (from 1-7): ");
        int day = in.nextInt();

        // Determine if it is holiday or not
        System.out.print("Is it holiday or not? (true/false): ");
        boolean holiday = in.nextBoolean();
         
        // Do I have work today? (if-else-if-else)
        if (day >= 1 && day <= 7 && holiday == true) {
            System.out.println("Woohoo, no work!");
        } else if (day == 6 || day == 7) {
            System.out.println("It's the weekend, no work!");
        } else if(day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
            System.out.println("Wake up at 7AM.");
        } else {
            System.out.println("Invalid day number!");
        }
        
    }

}
