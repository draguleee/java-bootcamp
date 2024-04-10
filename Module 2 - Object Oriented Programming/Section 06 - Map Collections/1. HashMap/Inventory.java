import java.util.HashMap;
import java.util.Map;

/**
 * Inventory class
 */

public class Inventory {
    public static void main(String[] args) {

        // Create a new HashMap object
        Map<String, Double> inventory = new HashMap<>();

        // Add entries
        inventory.put("Bananas", 2.99);
        inventory.put("Papaya", 5.99);
        inventory.put("Kale", 4.99);
        inventory.put("Apples", 1.99);
        inventory.put("Carrot", 1.49);
        inventory.put("Lime", 0.49);
        inventory.put("Toothpaste", 5.99);
        inventory.put("Zucchini", 5.99);

        // Prompt the user with the Java Grocers message
        System.out.println("\nWelcome to Java Grocers. What can we help you find?:\n");

        // Get the price of lime
        System.out.println("\nWhat is the price of Lime?");
        System.out.println(inventory.get("Lime"));

        // Get the price of zucchini
        System.out.println("\nWhat is the price of Zucchini?");
        System.out.println(inventory.get("Zucchini"));

        // Get the price of kale
        System.out.println("\nWhat is the price of Kale?");
        System.out.println(inventory.get("Kale"));

        // Check if the entry with "Apples" key exists
        System.out.println("\nDo you guys sell Apples?");
        boolean result = inventory.containsKey("Apples");
        String response = result ? "Yes!" : "No, sorry!";
        System.out.println(response);

    }
}
