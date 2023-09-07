/**
 * Workboom 2.5 - JavaGram
 * - You will create a signup page for JavaGram!
 * - Careful of the incoming trap: you will encounter the nextLine() trap
 * when picking up the username
 * - nextLine trap:
 *   * Pitfall: nextLine() gets skipped when placed after nextInt(), nextDouble, nextLong or next().
 *   * Solution: add an extra nextLine() before the "real" nextLine().
 */

import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        
        // Create the Scanner
        Scanner scan = new Scanner(System.in);
        

        // Task 1: use Scanner to pick up each response.
        System.out.println("Welcome to JavaGram! Let's sign you up.");

        // Pick up the first name
        System.out.println("What is your first name?");
        String firstName = scan.next();

        // Pick up the last name
        System.out.println("What is your last name?");
        String lastName = scan.next();

        // Pick up the age
        System.out.println("How old are you?");
        int age = scan.nextInt();

        // Pick up an username
        scan.nextLine();
        System.out.println("Make a username");  
        String username = scan.next();
        
        // Pick up city
        System.out.println("What city do you live in?");
        String city = scan.next();

        // Pick up country
        System.out.println("What country is that?");
        String country = scan.next();


        // Task 2: print the data that you picked up.
        // - /n: inserts a new line.
        // - /t: inserts a tab of space.
        System.out.println("Thank you for joining JavaGram!");
        System.out.println("\nHere is the information you entered:");
        System.out.println("\tFirst Name: " + firstName);
        System.out.println("\tLast Name: " + lastName);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + username);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);

        // Close scanner. It's good practice :D 
        scan.close();
        
    }
}
