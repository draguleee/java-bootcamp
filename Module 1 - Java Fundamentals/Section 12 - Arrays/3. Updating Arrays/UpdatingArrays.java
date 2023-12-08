import java.util.Arrays;

/**
 * Updating arrays:
 * - We can update an element from its index
 * - If we want to change an element, just refer to its index and change the value
 * 
 * Can we change the length of an array?
 * Answer: No, we cannot change the length of an array!
 */

public class UpdatingArrays {
    public static void main(String[] args) {
        
        // Store a menu in an array
        String[] menu = {"Espresso", "Iced Coffee", "Macchiato"};

        // Update the menu
        menu[2] = "Latte";

        // Print the menu using toString(array) method
        System.out.println(Arrays.toString(menu));

        // Create another menu that has more products
        String[] newMenu = new String[5];

        // Copy each element from the old menu to the new menu
        for (int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
        }
        System.out.println(Arrays.toString(newMenu));

        // Add new products to the menu
        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";
        System.out.println(Arrays.toString(newMenu));
    } 
}