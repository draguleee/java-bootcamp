/**
 * Workbook 4.2 - Tip
 * 
 * your bill was $53.50. It's polite to tip the waiter 15% of your bill.
 */

public class Tip {

    public static void main(String[] args) {

        // The total bill
        double bill = 53.5;

        // Calculate and tip the waiter
        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Thank you!");
        tipTheWaiter(bill);
        
    }

    /**
     * tipTheWaiter: function that calculates a tip and prints it.
     * @param bill (double)
     * @return none (void)
     * 
     * Inside the function:
     *  1. Calculates a tip that's 15 percent of bill.
     *  2. Prints: Your service was wonderful! Please, accept this tip: $<tip>
     */
    public static void tipTheWaiter(double bill) {
        double tip = 0.15 * bill;
        System.out.println("Your service was wonderful! \nPlease, accept this tip: " + tip);
    }

}