/*
 * Double Type
 * 
 * 1. Identify a type that can store decimal numbers: double
 * 
 * 2. Name the variable using lowerCamelCase: long globalPopulation
 * 
 * 3. Set the variable equal to a value: long globalPopulation = 8000000000 
 */

public class DoubleType {
    public static void main(String[] args) {
        
        // percentage variable of type double with value 73.5;
        double percentage = 73.5;
        System.out.println(percentage + " of percentages are made up.");
   
        // wallet variable of type double with value 20
        double wallet = 20;
        
        // people variable of type int with value 3
        int people = 3;

        // Split 20 dollars to 3 people
        System.out.println(wallet / people);

    }

}

/*
 * - double type take 8 bytes of memory.
 * - avoid using int for math calculations!
 *   -> int * int = int
 *   -> int / int = int (example: 11 / 2 = 5, NOT 5.5!)
 * - '_' can used to make a very large number easier to read.
 */