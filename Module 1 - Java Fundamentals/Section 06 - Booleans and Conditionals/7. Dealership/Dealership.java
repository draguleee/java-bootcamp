/** 
 * Dealership Application
 */

import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {

        // Create the Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println(" - Welcome to the Java Dealership");
        System.out.println(" - Select option 'a' to buy a car");
        System.out.println(" - Select option 'b' to sell a car");
        String option = scan.nextLine();


        /******************Part 1******************/
        switch (option) {
            case "a": 
                System.out.println("\nYou chose option " + option); 
                System.out.println("\nWhat is your budget?");
                double budget = scan.nextDouble();
                if(budget >= 10000) {
                    System.out.println("\nGreat! A Nissan Altima is available");
                    System.out.println("\nDo you have insurance? Write 'yes' or 'no'");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("\nDo you have a license? Write 'yes' or 'no'");
                    String license = scan.nextLine();
                    System.out.println("\nWhat is your credit score?");
                    int creditScore = scan.nextInt();
                    if(insurance.equalsIgnoreCase("yes") && license.equalsIgnoreCase("yes") && creditScore > 660) {
                        System.out.println("\nSold! Pleasure doing business with you");
                    } else {
                        System.out.println("\nSorry, we cannot sell you a car.");
                    }
                } else {
                    System.out.println("\nWe're sorry. You are not eligible");
                }
                break;
            case "b":
                System.out.println("\nYou chose option " + option);
                System.out.println("\nWhat is your car valued at?");
                int value = scan.nextInt();
                System.out.println("\nWhat is your selling price?");
                int price = scan.nextInt();
                if(value > price && price < 30000) {
                    System.out.println("\nWe will buy your car. Pleasure doing business with you!");
                } else {
                    System.out.println("\nSorry, we are not interested.");
                }
                break;
            default:
                System.out.println("\nInvalid option!");
        }

        // Close the Scanner
        scan.close();

    }
}
