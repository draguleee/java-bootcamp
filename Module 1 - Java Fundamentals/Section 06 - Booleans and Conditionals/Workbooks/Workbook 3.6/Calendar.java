/**
 * Workbook 3.6 - Your Calendar
 */

public class Calendar {
    public static void main(String[] args) {
        
        // Variable day of type int
        String day = "Friday"; 

        // Your friend asks if you can hang out on that day
        System.out.println("\nFriend: Hey, are you free on " + day + "?");
        System.out.println("Me: Hmm, let me check my calendar.");
        
        // Check 'calendar' here:        
        switch (day) {
            case "Monday": System.out.println("\nSorry, I have to stay at work late."); break;
            case "Tuesday": System.out.println("\nIt looks like I have meetings all day."); break;
            case "Wednesday": System.out.println("\nI have a dentist appointment. Some other time!"); break;
            case "Thursday": System.out.println("\nSorry, Thursday is date night!"); break;
            case "Friday" : case "Saturday" : case "Sunday": System.out.println("\nI'm free!"); break;        
            default: System.out.println("\nThat's not a day.");
        }
    }
}
