/**
 * Build an interactive application using Scanner
 * 
 * The process:
 * 
 * 1. Create an instance of Scanner: Scanner in = new Scanner(System.in);
 *    Scanner contains methods that can scan for user input:
 *    - nextInt(): scan for integers
 *    - nextDouble(): scan for decimals
 *    - nextLine(): scan for text
 * 
 * 2. Use Scanner methods to pick up user input:
 *    - int integ = in.nextInt();
 *    - double decim = in.nextDouble();
 *    - String text = in.nextLine();
 */

import java.util.*;


public class Survey {
    public static void main(String[] args) {

        //*********PART A: PICKING UP THE USER'S ANSWERS*********
        System.out.println("Welcome. Thank you for taking the survey");

        // Create an instance for Scanner
        Scanner in = new Scanner(System.in);

        // Create a counter variable for couning the questions
        int counter = 0;

        // Pick up text to return as a String (name)
        System.out.println("\nWhat is your name?");
        String name = in.nextLine();
        counter++;

        // Pick up decimal to return as a double (coffeePrice)
        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice = in.nextDouble();
        counter++;

        // Pick up decimal to return as a double (foodPrice)
        System.out.println("\nHow much money do you spend on fast food?");
        double foodPrice = in.nextDouble();
        counter++;

        // Pick up integer to return as a int (coffeeAmount)
        System.out.println("\nHow many times a week do you buy coffee?");
        int coffeeAmount = in.nextInt();
        counter++;

        // Pick up integer to return as a int (foodAmount)
        System.out.println("\nHow many times a week do you buy fast food?");
        int foodAmount = in.nextInt();
        counter++;

        // Close the Scanner
        in.close();


        //*********PART B: RESPONDING TO THE USER**********
        System.out.println("\nThank you " + name + " for answering all " + counter + " questions");
        System.out.println("Weekly, you spend $" + (coffeePrice*coffeeAmount) + " on coffee");
        System.out.println("Weekly, you spend $" + (foodPrice*foodAmount) + " on food");

    }
}
