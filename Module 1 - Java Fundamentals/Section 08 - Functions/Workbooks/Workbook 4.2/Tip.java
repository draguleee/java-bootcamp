/**
 * Workbook 4.2 - Tip the Waiter
 * 
 * Your bill was $53.50. It's polite to tip the waiter 15% of your bill.
 */

public class Tip {
    public static void main(String[] args) {

        // Double variable that stores the bill
        double bill = 53.5;
        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Me: Thank you!");
    
        // Call a function that tips the waiter
        tipTheWaiter(bill);
    }

    /**
     * tipTheWaiter - calculates a tip and prints it.
     * @param bill (double)
     * @return none
     * 
     * Inside the function:
     *  1. Calculates a tip that's 15 percent of bill.
     *  2. Prints: Your service was wonderful! Please, accept this tip: $<tip>
     */
    public static void tipTheWaiter(double bill) {
        double tip = 0.15 * bill;
        System.out.println("Me: Your service was wonderful! Please, accept this tip: " + tip);
    }

}