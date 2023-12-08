import java.util.Scanner;

/**
 * Workbook 6.3 - Grocer
 * 
 * Your job is to help customers find what they're looking for.
 */

public class Grocer {
    public static void main(String[] args) {
        
        // Create an array that stores aisles.
        String[] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};

        // A customer is asking for coffee...
        System.out.println("\nDo you sell coffee?");  
        for (int i = 0; i < aisles.length; i++) {
            if (aisles[i] == "coffee") {
                System.out.println("We have that is aisle: " + i + ".");
            }
        }
    }
}
