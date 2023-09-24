/**
 * Switch Statements
 * 
 * - Used to compare a variable to a list of values / cases
 * - Favor switch when comparing a variable against many values
 */

public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        // Determine what to wear based on the weather (e.g., sunny, cloudy, rainy, snowy)
        // Decide whether to use if-else or switch
        String weather = "sunny";
        switch (weather) {
            case "sunny": System.out.println("\nYou can wear a shirt."); break;
            case "cloudy": System.out.println("\nYou shoul wear a sweater."); break;
            case "rainy": System.out.println("\nYou should wear a raincoat."); break;
            case "snowy": System.out.println("\nYou should wear a jacket."); break;
            default: System.out.println("\nWear whatever you want."); break;
        }

        // Section 2: User role
        // Determine user access level based on the role (e.g., 1: admin, 2: editor, 3: user)
        // Decide whether to use if-else or switch
        int role = 2;
        switch (role) {
            case 1: System.out.println("\nADMIN"); break;
            case 2: System.out.println("\nEDITOR"); break;
            case 3: System.out.println("\nUSER"); break;        
            default: System.out.println("\nINVALID"); break;
        }

        // Section 3: Temperature and humidity
        // Determine the comfort level based on both temperature and humidity (e.g., too hot, too cold, comfortable)
        // Decide whether to use if-else or switch
        int temperature = 75;
        int humidity = 65;
        if (temperature >= 80 && humidity >= 60) {
            System.out.println("\nIt's too hot and humid!");
        } else if (temperature >= 80) {
            System.out.println("\nIt's too hot!");
        } else if (temperature <= 60 && humidity >= 60) {
            System.out.println("\nIt's too cold and humid!");
        } else if (temperature <= 60) {
            System.out.println("\nIt's too cold!");
        } else {
            System.out.println("\nIt's comfortable.");
        }

        // Section 5: Age and income
        // Determine eligibility for a specific credit card based on age and income
        // Decide whether to use if-else or switch
        int age = 25;
        int income = 50000;
        if (age >= 18 && age <= 60 && income >= 30000) {
            System.out.println("\nYou are eligible for the credit card.");
        } else {
            System.out.println("\nYou are not eligible for the credit card.");
        }

        // Section 6: Traffic light colors
        // Determine what action to take based on the traffic light color (e.g., green, yellow, red)
        // Decide whether to use if-else or switch
        String lightColor = "green";
        switch (lightColor) {
            case "green": System.out.println("\nYou can drive."); break;
            case "yellow": System.out.println("\nSlow down."); break;
            case "red": System.out.println("\nStop!");
            default: System.out.println("\nPower outage!"); break;
        }

        // Section 7: Exam grade
        // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
        // Decide whether to use if-else or switch
        int grade = 85;
        if (grade >= 80) {
            System.out.println("\nYou got an A!");
        } else if (grade >= 70) {
            System.out.println("\nYou got a B!");
        } else if (grade >= 60) {
            System.out.println("\nYou got a C!");
        } else if (grade >= 50) {
            System.out.println("\nYou got a D!");
        } else {
            System.out.println("\nYou failed.");
        }

        // Section 8: Browser type
        // Check if the browser is one of the following: Chrome, Firefox, Safari, Edge, or Opera
        // Decide whether to use if-else or switch
        String browser = "Chrome";
        switch (browser) {
            case "Chrome": System.out.println("\nEnjoy Chrome :)"); break;
            case "Firefox": System.out.println("\nEnjoy Firefox :)"); break;
            case "Safari": System.out.println("\nEnjoy Safari :)"); break;
            case "Edge": System.out.println("\nEnjoy Edge :)"); break;
            case "Opera": System.out.println("Enjoy Opera :)"); break;
            default: System.out.println("What browser is this though :|"); break;
        }
    }
}
