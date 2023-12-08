import java.util.Scanner;

/**
 * Workbook 6.4 - Grocer
 */

public class Grocer {
    public static void main(String[] args) {
        
        // Create the Scanner        
        Scanner scan = new Scanner(System.in);        
        
        // Create a String array with all the aisles
        String[] store = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        
        // Store the user's response in a String variable
        System.out.println("\nWelcome to Java Grocers. ");
        System.out.println("What can I help you find?");
        System.out.print("Product: ");
        String product = scan.nextLine();
        
        // Check every element in the array
        // If there is a match, break the loop and print the aisle (index)
        for (int i = 0; i < store.length; i++) {
            if (product.equals(store[i])) {
                System.out.println("\nWe have that in aisle: " + i + ".");
            }       
        }
        
        // Close the Scanner
        scan.close();

    }
}
