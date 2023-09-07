/*
 * Process:
 * 
 * 1. Identify a type that can store text: String
 * 
 * 2. Name the variable using lowerCamelCase: String announcement
 * 
 * 3. Set the variable equal to a value: String announcement = "I'm hungry!"
 */

public class Strings {
    public static void main(String[] args) {
    
        // year variable of type int of value 2010
        int year = 2010;

        // winner variable of type String of value "Spain"
        String winner = "Spain";

        // announcement variable of type String
        String announcement = "The winner of the " + year + " World Cup is " + winner;
        System.out.println(announcement);
    } 
}

/*
 * - String type take variable amounts of memory depending on the stored string.
 * - String is a class.
 */