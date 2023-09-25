/**
 * Type Casting
 */

public class TypeCasting {
    public static void main(String[] args) {

        // Variables ants and purchasedBlockOfCheese of type int
        int ants = 2000;
        int purchasedBlocksOfCheese = 1;

        // Typecast the division between purchasedBlockOfCheese and ants to double
        System.out.println("\nThere are " + ants + " ants, and " + purchasedBlocksOfCheese + " block of cheese.");
        System.out.println("Each ant carried " + ((double)purchasedBlocksOfCheese / ants) + " from the total cheese amount"); 

        // Variables for salary
        double salary = 5423.94;            // Exact salary
        int roundedSalary = (int)salary;    // Rounded saary

        // Typecast the salary to an ineger (the broker doesn't care about the significant decimals :) )
        System.out.println("\nMortgage Broker: What is your monthly salary in dollars?");
        System.out.println("My monthly salary is: " + roundedSalary);

    }

}
