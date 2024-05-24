import java.math.BigDecimal;

/**
 * BigDecimal
 */

public class Decimals {
    public static void main(String[] args) {

        // Create two BigDecimal objects
        BigDecimal x = new BigDecimal("0.1");
        BigDecimal y = new BigDecimal("0.2");

        // Add the two BigDecimal values and print it
        BigDecimal add = x.add(y);
        System.out.println(add);

        // Subtract the two BigDecimal values and print it
        BigDecimal sub = y.subtract(x);
        System.out.println(sub);

    }

}