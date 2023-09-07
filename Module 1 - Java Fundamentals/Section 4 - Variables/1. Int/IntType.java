/* 
 * Process:
 * 
 * 1. Identify a type that can store bus passengers: int
 * Golden rule: use the smallest amount of memory possible.
 * 
 * 2. Name the variable using lowerCamelCase: int passengers
 * 
 * 3. Set the variable equal to a value: int passengers = 5
 * 
 */

public class IntType {
    public static void main(String[] args) {
        
        // passengers variable of type int with value of 5
        int passengers = 5;
        System.out.println(passengers);

        // busTickets variable of type int with value equal with passengers
        int busTickets = passengers;
        System.out.println(busTickets);

        // Maximum value of int
        int maxValue = 2147483647;
        // int maxValue = 2147483648;       // out of range!
    }
}

/*
 * - int take 4 bytes of memory.
 * - int can store numbers between -2.147.483.648 and 2.147.3483.647.
 */