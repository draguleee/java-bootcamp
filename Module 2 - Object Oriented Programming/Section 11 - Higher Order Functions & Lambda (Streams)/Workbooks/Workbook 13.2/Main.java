import java.util.Arrays;
import java.util.List;

/**
 * Main class
 */

public class Main {
    public static void main(String[] args) {


        /****************** PART 1 ******************/

        // Create a List of Double values 
        List<Double> prices = Arrays.asList(55.99, 33.99, 88.99, 11.49, 55.99, 111.99, 77.99);

        // Sort the values in the prices List in descending order
        prices.sort((right, left) -> left.compareTo(right));

        // Print each price in the sorted List
        System.out.println("\nPrices\n------");
        prices.forEach(price -> System.out.println(price));


        /****************** PART 2 ******************/

        // Create a List of String values
        List<String> books = Arrays.asList(
            "To Kill a Mockingbird",
            "The Great Gatsby",
            "Pride and Prejudice",
            "The Catcher in the Rye",
            "The Alchemist",
            "One Hundred Years of Solitude",
            "Moby-Dick",
            "The Brothers Karamazov",
            "The Lord of the Rings",
            "The Picture of Dorian Gray"
        );

        // Sort the values in the books List in ascending (alphabetical) order
        books.sort((right, left) -> right.compareTo(left));

        // Print each book in the sorted List
        System.out.println("\nLibrary\n--------");
        books.forEach(book -> System.out.println(book));

    }
}