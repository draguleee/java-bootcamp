import java.util.Arrays;

/**
 * 2D Arrays:
 * - Represents an array that contains arrays
 * - It is perfect for data in the form of a table
 * 
 * Example:
 * int[][] integers = new int[3][4]
 * - The type is written with two brackets
 * - First brackets represent the number of rows
 * - Second brackets represent the number of columns
 * => We are creating a table with 3 rows and 4 columns!
 */

public class TwoArrays {
    public static void main(String[] args) {

        /* The slower way
         * 
         * // Create a 2D array of integer values with 3 rows and 4 columns
         * int[][] grades = new int[3][4];
         * 
         * // Update Harry's grades
         * grades[0][0] = 72;      // Potions 
         * grades[0][1] = 74;      // Herbology 
         * grades[0][2] = 78;      // Arithmancy 
         * grades[0][3] = 76;      // Charms 
         * 
         * // Update Ron's grades
         * grades[1][0] = 65;      // Potions 
         * grades[1][1] = 64;      // Herbology
         * grades[1][2] = 61;      // Arithmancy
         * grades[1][3] = 67;      // Charms
         * 
         * // Update Hermione's grades
         * grades[2][0] = 95;      // Potions
         * grades[2][1] = 98;      // Herbology
         * grades[2][2] = 99;      // Arithmancy
         * grades[2][3] = 100;     // Charms
         */

        // The faster way
        int[][] grades = {{72, 74, 78, 76},
                          {65, 64, 61, 67},
                          {95, 98, 99, 100}};

        // Print the contents
        System.out.println("Harry: " + Arrays.toString(grades[0]));
        System.out.println("Ron: " + Arrays.toString(grades[1]));
        System.out.println("Hermione: " + Arrays.toString(grades[2]));
        
        // Change Harry's grades
    }
    
}