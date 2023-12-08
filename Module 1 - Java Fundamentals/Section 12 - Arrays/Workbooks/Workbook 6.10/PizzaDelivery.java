import java.util.Scanner;

/**
 * Workbook 6.10 - Pizza Delivery
 */

public class PizzaDelivery {
    public static void main(String[] args) {
        
        // Create the Scanner
        Scanner scan = new Scanner(System.in);
        
        // Prompt the user to choose the number of toppings 
        System.out.println("\nHow many pizza toppings do you want?");
        System.out.print("Enter: ");
        int numToppings = scan.nextInt(); 
        scan.nextLine(); 
        
        // Populate the toppings array with the user's choices
        System.out.println("\nGreat, enter each topping!");
        String[] toppings = new String[numToppings]; 
        for (int i = 0; i < toppings.length; i++) {
            System.out.print((i+1) + ". ");
            toppings[i] = scan.nextLine();
        }
        
        // Print the chosen toppings
        System.out.println("\nThank you! Here are the toppings you ordered");
        for (int i = 0; i < toppings.length; i++) {
            System.out.println((i+1) + ". " + toppings[i] + " ");
        }

        // Confirm the order (press any button to confirm)
        System.out.println("\nPress anything to confirm your order.");
        scan.nextLine();
        System.out.println("Great, a driver is on the way!");

        // Close the Scanner
        scan.close();

    }
}
