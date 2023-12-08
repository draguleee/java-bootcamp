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
        for (int i = 0; i < prices.length; i++) {
            switch (i) {
                case 0: System.out.print("Baking: "); break;
                case 1: System.out.print("Beverage: "); break;
                case 2: System.out.print("Cereals: "); break;
            }
            for (int j = 0; j < prices.length; j++) {
                System.out.print(prices[i][j] + " ");
            } 
            System.out.println();
        }
    }
}
