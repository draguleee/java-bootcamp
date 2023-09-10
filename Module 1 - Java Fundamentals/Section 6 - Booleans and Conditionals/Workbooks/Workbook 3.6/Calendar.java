import java.util.Scanner;

/**
 * Workbook 3.6 - Calendar
 */

public class Calendar {
    public static void main(String[] args) {
        
        // Create the Scanner
        Scanner in = new Scanner(System.in);

        // Pick up the day 
        System.out.println("Friend: Let's see when I want to hang out with Andre...");
        System.out.print("* Pick a day: ");
        String day = in.next();

        // Determine if the two friends can meet.
        System.out.println("\nFriend: Hey, are you free on " + day + "?");
        System.out.println("Me: Hmm, let me check my calendar.");
        switch(day) {
            case "Monday" : case "monday" : case "MONDAY": System.out.println("\nMe: Sorry, I have to stay at work late."); break;
            case "Tuesday" : case "tuesday" : case "TUESDAY": System.out.println("\nMe: It looks like I have meetings all day."); break;
            case "Wednesday" : case "wednesday" : case "WEDNESDAY": System.out.println("\nMe: I have a dentist appointment. Some other time!"); break;
            case "Thursday" : case "thursday" : case "THURSDAY": System.out.println("\nMe: Sorry, Thursday is date night!"); break; 
            case "Friday" : case "friday" : case "FRIDAY": System.out.println("\nMe: I'm free!"); break;
            case "Saturday" : case "saturday" : case "SATURDAY": System.out.println("\nMe: I'm free!"); break;
            case "Sunday" : case "sunday" : case "SUNDAY": System.out.println("\nMe: I'm free!"); break;
            default: System.out.println("\nMe: That's not a day.");
        }
        
        // Close the Scanner
        in.close();
    }
    
}