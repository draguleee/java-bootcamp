/**
 * Double: used to store decimals (8 bytes of memory)
 * Decimals can reach 15 significant digits.
 * 
 * 
 * The process:
 * 
 * 1. Identify a type that can store decimals: double
 * 
 * 2. Name the variable using lowerCamelCase: double price
 * 
 * 3. Set a variable equal to a value: double price = 5.5;
 * 
 * 
 * Warning: never use int for math calculations!!!
 * - integer * integer = integer
 * - integer / integer = integer;
 */

public class Decimals {
    public static void main(String[] args) {
        
        // Create variable percentage of type double and print it
        double percentage = 73.5;
        System.out.println(percentage + "% of percentages are made up.");
    
        // Math calculations with integer
        int dividend1 = 11;
        int divisor1 = 2;
        System.out.println(dividend1 / divisor1);

        // Math calculations with decimals
        double dividend2 = 11.0;
        double divisor2 = 2.0;
        System.out.println(dividend2 / divisor2);

        // Example - always use double for math calculations!
        double wallet = 20;
        int people = 3;
        System.out.println(wallet / people);
    }
    
}