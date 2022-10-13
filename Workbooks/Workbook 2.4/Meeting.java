// Workbook 2.4

public class Meeting {
    public static void main(String[] args) {

        // Workbook variables
        double sales = 24309.65; 
        double profit = 18562.18; 
        double refunds = 688.78; 
        double shipping = 1233.57; 

        // Cast from double to int
        int roundedSales = (int)sales;
        int roundedProfit = (int)profit;
        int roundedRedfunds = (int)refunds;
        int roundedShipping = (int)shipping;

        System.out.println("This month, we made $" + roundedSales + " in sales");
        System.out.println("Factoring in costs, we made $" + roundedProfit + " in profit");
        System.out.println("The refunds are at a low $" + roundedRedfunds + ". This is a good sign!");
        System.out.println("Shipping costs were high. We paid $" + roundedShipping + " in shipping");

    }
}