/**
 * Workbook 3.2 - JavaMart
 * 
 You will start with $100, and your kids will ask you to buy them stuff.
 */

public class JavaMart {
    public static void main(String[] args) {

        // Wallet variable of type double
        double wallet = 100;

        // See if you can buy the toy car for your child
        double toyCar = 5.99;
        System.out.println("\nCan I get this car?");
        if(wallet >= toyCar) {
            System.out.println("Sure!");
            wallet -= toyCar;
        } else {
            System.out.println("Sorry, I only have " + wallet + " left.");
        }

        // See if you can buy the Nike shoes for your child
        double nike = 95.99;
        System.out.println("\nCan I get these Nike shoes?");
        if(wallet >= nike) {
            System.out.println("Sure!");
            wallet -= nike;
        } else {
            System.out.println("Sorry, I only have " + wallet + " left.");
        }
    }
}
