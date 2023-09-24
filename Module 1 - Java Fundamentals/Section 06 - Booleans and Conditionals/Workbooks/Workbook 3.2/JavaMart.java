/**
 * Workbook 3.2 - JavaMart
 * 
 * The Java Mart:
 * - You start with $100, and your kids will ask you to buy them stuff.
 * - Scenario 1: If you have enough money, display "Sure!" and update the wallet value.
 * - Scenario 2: If you don't have enough money, display "Sorry, I only have <wallet> left".
 */

public class JavaMart {
    public static void main(String[] args) {

        // Balance of the wallet
        double wallet = 100;

        // Check if the toy car can be bought
        double toyCar = 5.99;
        System.out.println("\nCan I get this car?");
        if(wallet >= toyCar) {
            System.out.println("Sure!");
            wallet -= toyCar;
            System.out.println("*You now have $" + wallet + ".");
        } else {
            System.out.println("Sorry, I only have $" + wallet + " left.");
        }

        // Chek if the Nike shoes can be bought
        double nike = 95.99;
        System.out.println("\nCan I get these nike shoes?");
        if(wallet >= nike) {
            System.out.println("Sure!");
            wallet -= nike;
            System.out.println("*You now have $" + wallet + ".");
        } else {
            System.out.println("Sorry, I only have " + wallet + " left");
        }

    }
}
