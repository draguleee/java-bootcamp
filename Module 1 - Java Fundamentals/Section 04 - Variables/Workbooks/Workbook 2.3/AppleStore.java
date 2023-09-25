/**
 * Workbook 2.3 - Apple Store
 */

public class AppleStore {
    public static void main(String[] args) {

        // Variables of type int
        int numOfApples = 0;        // Number of apples
        int numOfCustomers = 0;     // Number of customers
        double profit = 0;          // Profit

        // Supplement the number of apples to 500
        System.out.println("\nYou picked 500 apples from an apple orchard");
        numOfApples += 500;

        // Establish a price for an apple
        System.out.println("\nTime for business! You're selling each apple for 40 cents");
        double price = 0.4;

        // Sell 4 apples to the first customer
        System.out.println("\nOne customer walked in. He bought 4 apples!");
        numOfCustomers++;
        numOfApples -= 4;
        profit += 4 * price;

        // Sell 20 apples to the second customer
        System.out.println("\nAnother customer walked in. He bought 20 apples!");
        numOfCustomers++;
        numOfApples -= 20;
        profit += 20 * price;

        // Sell 200 apples to the third customer
        System.out.println("\nAnother customer walked in. She bought 200 apples!");
        numOfCustomers++;
        numOfApples -= 200;
        profit += 200 * price;

        // Round up the results for the day!
        System.out.println("\nWow! So far, you made: $" + profit);
        System.out.println(numOfCustomers +  " customers love your apples.");
        System.out.println("You have " + numOfApples + " apples left.");
        
    }

}
