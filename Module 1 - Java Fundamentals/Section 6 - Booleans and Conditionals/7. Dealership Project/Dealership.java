import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

// Dealership Project

public class Dealership {
    public static void main(String[] args) {
        
        // Create the Scanner
        Scanner in = new Scanner(System.in);

        // Welcome to the Dealership & Select option
        System.out.println("\nWelcome to the Java Dealership!");
        System.out.println(" - Select option a to buy a car.");
        System.out.println(" - Select option b to sell a car.");
        System.out.print("\nOption: ");
        String option = in.nextLine();

        // Switch-case to choose the case
        switch(option) {
            
            // Buy a car
            case "a" : 
                System.out.println("\nWhat is your budget?");
                int budget = in.nextInt();
                if(budget >= 10000) {
                    System.out.println("Great! A Nissan Altima is available.");
                    System.out.println("\nDo you have insurance? Write yes or no.");
                    in.nextLine();
                    String insurance = in.nextLine();
                    System.out.println("\nDo you have a driver's license? Write yes or no.");
                    String license = in.nextLine();
                    System.out.println("\nWhat is your credit score?");
                    int credit = in.nextInt();
                    if(insurance.equals("yes") && license.equals("yes") && credit > 660) {
                        System.out.println("\nSold! Pleasure doing business with you.");
                    }
                    else {
                        System.out.println("\nWe are sorry. You are not eligible.");
                    }
                }
                else {
                    System.out.println("We do not sell cars under 10000. Sorry!");
                }
            break;

            // Sell a car
            case "b": 
                System.out.println("\nWhat is your car valued at?");
                int value = in.nextInt();
                System.out.println("\nWhat is your selling price?");
                int price = in.nextInt();
                if(value > price && price < 30000) {
                    System.out.println("\nWe will buy your car! A pleasure doing business with you.");
                }
                else {
                    System.out.println("\nSorry. We are not interested...");
                }
            break;
            
            // Default case
            default: System.out.println("\nInvalid option."); break;
        }

        // Close the Scanner
        in.close();
    }
}