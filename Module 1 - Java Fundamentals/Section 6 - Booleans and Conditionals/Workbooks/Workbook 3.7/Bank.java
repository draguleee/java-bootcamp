/**
 * Workbook 3.7 - The Royal Bank of Java
 * 
 * In this workbook, you work for the Royal Bank of Java. Your job is to
 * approve customers for a loan if they:
 * - Have at least &10.000 in their savings account
 * - Have less than &5.000 in credit card debt
 * - Have worked for more than 2 years.
 * 
 * The user will also need to provide their name.
 * 
 * Task: scan for values and use if-else to control how these statements
 * print.
 */

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        // Create the Scanner
        Scanner scan = new Scanner(System.in);

        // Prompt the user to choose an option formortgage interogation
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        
        // Task 1 - Pick up the user's decision.
        String mortgage = scan.nextLine();

        // Task 2 - Print this if the decision is "yes"
        if(mortgage.equalsIgnoreCase("yes")) {
            System.out.println("\nGreat! In one line" +
                "\nHow much money do you have in your savings?" +
                "\nAnd, how much do you owe in credit card debt?");
            int savings = scan.nextInt();
            int debt = scan.nextInt();
            System.out.println("\nHow many years have you worked for?");
            int years = scan.nextInt();
            System.out.println("What is your name?");
            scan.nextLine();
            String name = scan.nextLine();
            if(savings >= 10000 && debt < 5000 && years > 2) {
                System.out.println("\nCongratulations, " + name + ". You have been approved!");
            } else {
                System.out.println("\nSorry, you are not eligible for a mortgage.");
            }
        }
        // Task 3 - print this if the decision is "no"
        else {
            System.out.println("\nOK. Have a nice day!");
        }

        // Close the Scanner
        scan.close();
    }
}
