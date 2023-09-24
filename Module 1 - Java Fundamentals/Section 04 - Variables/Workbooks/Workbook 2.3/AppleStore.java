/**
 * Workbook 2.3 - Apple Store
 */

public class AppleStore {
    public static void main(String[] args) {

        // The workbook stats with three variables
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;

        // Task 1: update your number of apples based of the printed messages.
        // Task 2: increase your number of customers based on the printed messages.
        
        System.out.println("You picked 500 apples from an apple orchard");
        numOfApples += 500;

        // Task 3: make a price variable and set it equal to 0.40; increase your profits based on the number of apples sold, and the price of each apple.
        System.out.println("Time for business! You're selling each apple for 40 cents");
        double price = .40;

        System.out.println("One customer walked in. He bought 4 apples!");
        numOfCustomers++;
        numOfApples -= 4;
        profit += (4*price);

        System.out.println("Another customer walked in. He bought 20 apples!");
        numOfCustomers++;
        numOfApples -= 20;
        profit += (20*price);

        System.out.println("Another customer walked in. She bought 200 apples!");
        numOfCustomers++;
        numOfApples -= 200;
        profit += (200*price);

        // Task 4: replace each placeholder with a variable.
        System.out.println("Wow! So far, you made: $" + profit + "!");
        System.out.println(numOfCustomers + " customers love your apples.");
        System.out.println("You have " + numOfApples + " apples left.");


        
    }

}
