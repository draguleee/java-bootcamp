/**
 * Workbook 2.4 - Meeting
 */

public class Meeting {
    public static void main(String[] args) {
        
        // Variables of type double for sales, profit, refunds, shipping
        double sales = 24309.65; 
        double profit = 18562.18; 
        double refunds = 688.78; 
        double shipping = 1233.57; 

        // We don't care about cents. Print each value as a whole number
        int roundedSales = (int)sales;
        int roundedProfit = (int)profit;
        int roundedRefunds = (int)refunds;
        int roundedShipping = (int)shipping;

        // Print the rounded financial data
        System.out.println("This month, we made $" + roundedSales + " in sales");
        System.out.println("Factoring in costs, we made $" + roundedProfit + " in profit");
        System.out.println("The refunds are at a low $" + roundedRefunds + ". This is a good sign!");
        System.out.println("Shipping costs were high. We paid $" + roundedShipping + " in shipping");

    }
}
