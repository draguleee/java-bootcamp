/**
 * Switch Statements
 * - Simplify code and make it much easier to read
 * - Compare one variable against a list of values
 * -  Favour switch when comparing a variables against many values!
 */

public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions (switch)
        String weather = "rainy";
        switch (weather) {
            case "sunny": System.out.println("\nWear light garments!"); break;
            case "cloudy": System.out.println("\nWear a sweater!"); break;
            case "rainy": System.out.println("\nBring an umbrella!"); break;
            case "snowy": System.out.println("\nSnowfight!"); break;
            default: System.out.println("\nWe don't know what to do in this weather.");
        }

        // Section 2: User role (switch)
        int role = 2;
        switch (role) {
            case 1: System.out.println("\nAdmin"); break;
            case 2: System.out.println("\nEditor"); break;
            case 3: System.out.println("\nUser"); break;
            default: System.out.println("\nMaintenance");
        }

        // Section 3: Temperature and humidity (if-else)
        int temperature = 75;
        int humidity = 65;
        if(temperature >= 80 && humidity >= 60) {
            System.out.println("\nIt's too hot and humid!");
        } else if(temperature >= 80) {
            System.out.println("\nIt's too hot!");
        } else if(temperature <= 60 && humidity >= 60) {
            System.out.println("\nIt's too cold and humid!");
        } else if(temperature >= 60) {
            System.out.println("\nIt's too cold!");
        } else {
            System.out.println("\nIt's comfortable.");
        }

        // Section 5: Age and income (if-else)
        int age = 25;
        int income = 50000;
        if(age >= 18 && age <= 60 && income >= 30000) {
            System.out.println("\nCongratulations, you are eligible for the credit card.");
        } else {
            System.out.println("\nSorry, you are not eligible for the credit card.");
        }

        // Section 6: Traffic light colors (switch)
        String lightColor = "green";
        switch (lightColor) {
            case "green": System.out.println("\nYou can go!"); break;
            case "yellow": System.out.println("\nSlow down!"); break;
            case "red": System.out.println("\nStop!"); break;
            default: System.out.println("\nPower outage!");
        }

        // Section 7: Exam grade (switch)
        int score = 85;
        if(score >= 80) {
            System.out.println("\nYou got an A!");
        } else if(score >= 70) {
            System.out.println("\nYou got a B!");
        } else if(score >= 60) {
            System.out.println("\nYou got a C!");
        } else if (score >= 50) {
            System.out.println("\nYou got a D");
        } else {
            System.out.println("\nYou failed. Better luck next time!");
        }

        // Section 8: Browser type (switch)
        String browser = "Chrome";
        switch (browser) {
            case "Chrome": System.out.println("\nYou are using Chrome."); break;
            case "Firefox": System.out.println("\nYou are using Firefox"); break;
            case "Safari": System.out.println("\nYou are using Safari"); break;
            case "Edge": System.out.println("\nYou are using Edge"); break;
            case "Opera": System.out.println("\nYou are using Opera"); break;
            default: System.out.println("\nEnjoy your browser... Hmm... What browser do you use though?");
        }
    }
}
