import java.util.Arrays;
import java.util.List;

/**
 * Stream Operation
 * 
 * 
 * The Process
 * 
 * 1. Convert your data source into a stream of elements.
 * 
 * 2. Add a filter operation to the pipeline.
 *    Filter: receives a stream of elements and returns a filtered stream
 * 
 * 3. Add a map operation to the pipeline.
 *    Map: transforms every element in the stream
 * 
 * 4. Add a sorted operation to the pipeline.
 *    Sorted: receives a stream and returns a sorted stream
 * 
 * 5. Add another map operation to the pipeline.
 * 
 * 6. Add a foreach operation to the pipeline.
 *    Foreach: receives a stream and produces an output
 */

public class Main {
    public static void main(String[] args) {

        // Create an ArrayList containing Double values
        List<Double> prices = Arrays.asList(341.67, 209.32, 88.41, 269.99, 68.49, 499.99, 28.12, 354.38);

        // The Process (see steps)
        prices.stream()
                .filter(price -> price > 100)
                .map(price -> price - 2)
                .sorted((right, left) -> right.compareTo(left))
                .map(price -> "$" + price)
                .forEach(price -> System.out.println(price));
    }
}