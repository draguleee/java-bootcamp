import java.util.Scanner;

// Workbook 3.6

public class Calendar {
    public static void main(String[] args) {
        
        // Create the Scanner
        Scanner in = new Scanner(System.in);

        // Pick a name for your friend
        System.out.println("\nA: Who should we invite out?");
        System.out.print("B: ");
        String name = in.nextLine();

        // Pick a day to go out
        System.out.println("\nA: When should we go out?");
        System.out.print("B: ");
        String day = in.nextLine();

        // Switch-case
        System.out.println("\nA: Hey, " + name + " are you free on " + day + "? \n");
        System.out.println(name + ": Hmm, let me check my calendar.");
        switch(day) {
            case "Monday": System.out.println("Sorry, I have to stay at work late."); break;
            case "Tuesday": System.out.println("It looks like I have meetings all day."); break;
            case "Wednesday": System.out.println("I have a dentist appointment. Some other time!"); break;
            case "Thurdsay": System.out.println("Sorry, Thursday is date night!"); break;
            case "Friday" : case "Saturday" : case "Sunday": System.out.println("I'm free!!"); break;
            default: System.out.println("That's not a day.");

        } 
    }
}