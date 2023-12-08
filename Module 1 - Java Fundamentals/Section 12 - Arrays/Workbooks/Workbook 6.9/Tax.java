import java.util.Arrays;

/**
 * Workbook 6.9 - Tax
 */

public class Tax {
    public static void main(String[] args) {

        // Array of type double that stores four prices
        double[] price = {1.99, 2.99, 3.99, 4.99};

        // Create an array with the same length as price array
        double[] afterTax = new double[price.length];
        
        // Update each element in afterTax to equal the original price + tax
        // NOTE: tax is 13% = 0.13
        for (int i = 0; i < price.length; i++) {
            afterTax[i] = price[i] + 0.13 * price[i];
        }
        
        System.out.println("The original prices are: " + Arrays.toString(price));
        System.out.println("The prices after tax are: " + Arrays.toString(afterTax));

    }
}
