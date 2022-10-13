// Workbook 3.2

public class JavaMart {
    public static void main(String[] args) {
        
        // Variables for the balance and for the prices
        double wallet = 100;
        double toyCar = 5.99;
        double nike1 = 95.99;
        double nike2 = 89.99;

        // Check if you can buy the toy car
        System.out.println("Can I get this car?");
        if(wallet >= toyCar) {
            System.out.println("Sure!");
            wallet -= toyCar;
        }
        else {
            System.out.println("Sorry, I only have $" + wallet + " left.");
        }

        // Check if you can buy the 95.99 Nike shoes
        System.out.println("Can I get these blue Nike shoes?");
        if(wallet >= nike1) {
            System.out.println("Sure!");
            wallet -= nike1;
        }
        else {
            System.out.println("Sorry, I only have $" + wallet + " left.");
        }

        // Check if you can buy the 89.99 Nike shoes
        System.out.println("Can I get these black Nike shoes instead?");
        if(wallet >= nike2) {
            System.out.println("Sure!");
            wallet -= nike2;
        }
        else {
            System.out.println("Sorry, I only have $" + wallet + " left.");
        }

        // Print the final balance
        System.out.println("What a shopping spree! I got $" + wallet + " left in my wallet!");
    }
}
