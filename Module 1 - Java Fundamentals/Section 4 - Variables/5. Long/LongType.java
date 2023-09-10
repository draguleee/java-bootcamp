/*
 * Long Type:
 * 
 * 1. Identify a type that can store very large numbers: long
 * 
 * 2. Name the variable using lowerCamelCase: long globalPopulation
 * 
 * 3. Set the variable equal to a value: long globalPopulation = 8000000000 
 */

public class LongType {
    public static void main(String[] args) {
        
        // globalPopulation variable of type long with value 8 billion
        long globalPopulation = 8_000_000_000L;
        System.out.println("The global population is: " + globalPopulation);

        // dailyGoogleSearches variable of type long with value 85 billion
        long dailyGoogleSearches = 85_000_000_000L;
        System.out.println("Daily, there are " + dailyGoogleSearches + " daily Google searches.");
    }
    
}

/*
 * - long type take 8 bytes of memory.
 * - after variable declaration, put a 'L' after the number so that Java can recognise the number as long type.
 * - '_' can used to make a very large number easier to read.
 */