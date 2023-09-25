/**
 * Long Type: used to store large whole numbers (8 bytes of memory)
 * 
 * 
 * The process:
 * 
 * 1. Identify a type that can store large whole numbers: long
 * 
 * 2. Name the variable using lowerCamelCase: long globalPopulation
 * 
 * 3. Set a variable equal to a value: long globalPopulation = 8_000_000_000L;
 * 
 * 
 * Remember: 
 * - Add an L after defining a long variable!
 * - Add underscores (_) to easily read the long numbers.
 */

public class LongType {
    public static void main(String[] args) {
        
        // Variables globalPopulation and dailyGoogleSearches of type long
        long globalPopulation = 8_000_000_000L;
        long dailyGoogleSearches = 8_500_000_000L;

        // Embed the variables on a String
        System.out.println("The global population is " + globalPopulation);
        System.out.println("Daily, there are " + dailyGoogleSearches + " Google searches.");
    }
    
}