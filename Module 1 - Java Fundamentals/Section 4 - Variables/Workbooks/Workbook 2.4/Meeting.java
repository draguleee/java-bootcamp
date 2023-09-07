/**
 * Workbook 2.4 - Meeting
 */

public class Meeting {
    public static void main(String[] args) {
        
        // Four double variables that store financial data
        double sales = 24309.65; 
        double profit = 18562.18; 
        double refunds = 688.78; 
        double shipping = 1233.57; 

        // Task 1: we don't care about cents!
        int roundedSales = (int)sales;
        int roundedProfit = (int)profit;
        int roundedRefunds = (int)refunds;
        int roundedShipping = (int)shipping;

        // Task 2: print the rounded financial data
        System.out.println("This month, we made $" + roundedSales + " in sales");
        System.out.println("Factoring in costs, we made $" + roundedProfit + " in profit");
        System.out.println("The refunds are at a low $" + roundedRefunds + ". This is a good sign!");
        System.out.println("Shipping costs were high. We paid $" + roundedShipping + " in shipping");

    }
}
