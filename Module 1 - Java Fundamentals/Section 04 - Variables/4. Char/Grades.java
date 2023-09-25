/**
 * Char Type: used to store single characters (1 byte of memory)
 * 
 * 
 * The process:
 * 
 * 1. Identify a type that can store a single character: char
 * 
 * 2. Name the variable using lowerCamelCase: char grade
 * 
 * 3. Set a variable equal to a value: char grade = 'A'
 * 
 * 
 * Golden Rule: use the smallest amount of memory possible
 */

public class Grades {
    public static void main(String[] args) {
        
        // Char varbailes with different values
        char potions = 'A';
        char arithmancy = 'B';
        char charms = 'C';

        // Print each grade as part of a long String
        System.out.println("Potions: " + potions);
        System.out.println("Arithmancy: " + arithmancy);
        System.out.println("Charms: " + charms);
    }
    
}