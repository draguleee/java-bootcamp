/**
 * Workbook 6.13 - Prices
 */

public class Prices {
    public static void main(String[] args) {

        // Create a 2D array of double values of 3x5 dimensions
        // double[][] prices = new double[3][5];
        double[][] prices = {
            {12.99, 8.99, 9.99, 10.49, 11.99},
            {0.99, 1.99, 2.49, 1.49, 2.99},
            {8.99, 7.99, 9.49, 9.99, 10.99}
        };

        // For the sake of exercise, populate the 2D array the long way
        // Index the elements one by one...

        /* 
        prices[0][0] = 12.99;
        prices[0][1] = 8.99;
        prices[0][2] = 9.99;
        prices[0][3] = 10.49;
        prices[0][4] = 11.99;

        prices[1][0] = 0.99;
        prices[1][1] = 1.99;
        prices[1][2] = 2.49;
        prices[1][3] = 1.49;
        prices[1][4] = 2.99;

        prices[2][0] = 8.99;
        prices[2][1] = 7.99;
        prices[2][2] = 9.49;
        prices[2][3] = 9.99;
        prices[2][4] = 10.99;
        */

        // Print the prices of each row using the following format
        System.out.println("Baking: " + prices[0][0] + " " + prices[0][1] + " " + prices[0][2] + " " + prices[0][3] + " " + prices[0][4]);
        System.out.println("Beverage: " + prices[1][0] + " " + prices[1][1] + " " + prices[1][2] + " " + prices[1][3] + " " + prices[1][4]);
        System.out.println("Cereals: " + prices[2][0] + " " + prices[2][1] + " " + prices[2][2] + " " + prices[2][3] + " " + prices[2][4]);

    }
}
