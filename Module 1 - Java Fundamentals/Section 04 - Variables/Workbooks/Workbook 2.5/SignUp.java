import java.util.Scanner;

/**
 * Workbook 2.5 - JavaGram
 * 
 * In this workbook, you will create a sign up page for JavaGram!
 * 
 * Careful for the incoming nextLine() trap!
 * You will encounter the nextLine() trap when picking up the username.
 * 
 * nextLine() Trap	
 * Pitfall:	        nextLine() gets skipped when placed after nextInt() , nextDouble(), or nextLong().
 * Solution:        Add an extra nextLine() before the "real" nextLine(). 

 */

public class SignUp {
    public static void main(String[] args) {
        
        // Create the Scanner
        Scanner scan = new Scanner(System.in);
        
        // Welcome the user to JavaGram and pick up each response
        System.out.println("\nWelcome to JavaGram! Let's sign you up.");
        
        // Pick up the first name
        System.out.println("\nWhat is your first name?");
        String firstName = scan.nextLine();
        
        // Pick up the last name
        System.out.println("\nWhat is your last name?");
        String lastName = scan.nextLine();

        // Pick up the age
        System.out.println("\nHow old are you?");
        int age = scan.nextInt();

        // Pick up the username (careful of the nextLine() trap!)
        System.out.println("\nMake a username");  
        scan.nextLine();
        String username = scan.nextLine();
        
        // Pick up the city
        System.out.println("\nWhat city do you live in?");
        String city = scan.nextLine();

        // Pick up the country
        System.out.println("\nWhat country is that?");
        String country = scan.nextLine();
        
        // Display the entered information
        System.out.println("\nThank you for joining JavaGram!");
        System.out.println("Here is the information you entered:");
        System.out.println("\tFirst Name: " + firstName);
        System.out.println("\tLast Name: " + lastName);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + username);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);

        // Close scanner. It's good practice :D ! 
        scan.close();
    }
}
