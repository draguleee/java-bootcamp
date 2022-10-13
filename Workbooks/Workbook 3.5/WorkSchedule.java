import java.util.Scanner;

// Workbook 3.5

public class WorkSchedule {
    public static void main(String[] args) {
        
        // Create the Scanner
        Scanner in = new Scanner(System.in);

        // Day of the week (variable)
        System.out.print("\nWhat day of the week is it? ");
        int day = in.nextInt();

        // Boolean value that signs a holiday
        System.out.print("\nIs it holiday? (type true / false): ");
        boolean holiday = in.nextBoolean();

        // Check the day of the week
        if(holiday) {
            System.out.println("\nWoohoo, no work!");
        }
        else if(day == 6 || day == 7) {
            System.out.println("\nIt's the Weekend, no work!");
        }
        else {
            System.out.println("\nWake up at 7:00...");
        }

        // Close the Scanner
        in.close();

    }
}