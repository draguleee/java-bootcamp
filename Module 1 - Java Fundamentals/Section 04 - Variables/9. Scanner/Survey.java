import java.util.Scanner;

/**
 * Build an interactive app using Scanner
 * 
 * 
 * The process:
 * 
 * 1. Create an instance of Scanner.
 *    Scanner contains methods that an scan for user input:
 *    - nextInt(): scans for integers
 *    - nextDouble(): scans for decimals
 *    - nextLine(): scans for text
 */

public class Survey {
    public static void main(String[] args) {

        // Crate the Scanner
        Scanner in = new Scanner(System.in);

        // Create the counter variable
        int counter = 0;


        //*********PART A: PICKING UP THE USER'S ANSWERS*********
        System.out.println("\nWelcome. Thank you for taking the survey");

        // Pick up the name
        System.out.println("\nWhat is your name?");
        String name = in.nextLine();
        counter++;

        // Pick up the amount of money spent on coffee
        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice = in.nextDouble();
        counter++;

        // Pick up the amount of money spent on food
        System.out.println("\nHow much money do you spend on fast food?");
        double foodPrice = in.nextDouble();
        counter++;

        // Pick up the times the user buys coffee a week
        System.out.println("\nHow many times a week do you buy coffee?");
        int coffeeAmount = in.nextInt();
        counter++;

        // Pick up the times the user buys fast food a week
        System.out.println("\nHow many times a week do you buy fast food?");
        int foodAmount = in.nextInt();
        counter++;


        //*********PART B: RESPONDING TO THE USER**********
        System.out.println("\nThank you, " + name + ", for answering all " + counter + " questions!");
        System.out.println("Weekly, you spend $" + (coffeePrice * coffeeAmount) + " on coffee.");
        System.out.println("Weekly, you spend $" + (foodPrice * foodAmount) +" on food.");


        // Close the Scanner
        in.close();
    }
}
