/**
 * Workbook 3.7 - Bank
 */

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        
        // Create the Scanner
        Scanner scan = new Scanner(System.in);

        // Ask the user if they are here to ge a loan and pick up their answer
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        String answer = scan.nextLine();

        // Decide if the user wants a loan or not or if they are eligible
        if(answer.equalsIgnoreCase("yes")) {
            System.out.println("\nGreat! In one line" +
                "\nHow much money do you have in your savings?" +
                "\nAnd, how much do you owe in credit card debt?");
            double savings = scan.nextDouble();
            double debt = scan.nextDouble();
            System.out.println("\nHow many years have you worked for?");
            int years = scan.nextInt();
            System.out.println("\nWhat is your name?");
            scan.nextLine();
            String name = scan.nextLine();
            if(savings >= 10000 && debt < 5000 && years > 2) {
                System.out.println("\nCongratulations, " + name + ". You have been approved!");
            } else {
                System.out.println("Sorry, you are not eligible for a mortgage.");
            }
        } else if(answer.equalsIgnoreCase("no")) {
            System.out.println("\nOK. Have a nice day!");
        } else {
            System.out.println("\nInvalid choice.");
        }       

        // Close the Scanner
        scan.close();
    }
}
