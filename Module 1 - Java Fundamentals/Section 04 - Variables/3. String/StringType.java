/**
 * String Type: used to store text (varies in memory)
 * 
 * The process:
 * 
 * 1. Identify a type that can store text: String
 * 
 * 2. Name the variable using lowerCamelCase: String announcement
 * 
 * 3. Set a variable equal to a value: String announcement = "I'm hungry!"
 */

public class StringType {
    public static void main(String[] args) {
        
        // Create year and winner variables of type int and String respectively
        int year = 2010;
        String winner = "Spain";

        // Join the two variables in a String
        String announcement = "The winner of the " + year + " World Cup is " + winner;
        System.out.println(announcement);
    }
    
}