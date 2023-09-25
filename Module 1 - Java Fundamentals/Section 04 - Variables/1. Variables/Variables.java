/**
 * Variables: used for storing data
 * 
 * 
 * The process:
 * 
 * 1. Identify a type that can store bus passengers: int
 *    Golden rule: use the smallest amount of memory possible.
 * 
 * 2. Name the variable using lowerCamelCase format: int passengers
 * 
 * 3. Set the variable equal to a value
 * 
 * 
 * Integers:
 * - Occupy 4 bytes in memory
 * - From: -2,147,483,648 To: 2,147,483,647
 */

public class Variables {
    public static void main(String[] args) {
        
        // Create variable passengers of type int and print it
        int passengers = 5;
        System.out.println(passengers);

        // Create variable busTickets of type int and print it
        int busTickets = passengers;
        System.out.println(busTickets);

        // Create variable maxValue of type int equaling the maximum value and print it
        int maxValue = 2147483647;
        System.out.println(maxValue);
        
    }
    
}