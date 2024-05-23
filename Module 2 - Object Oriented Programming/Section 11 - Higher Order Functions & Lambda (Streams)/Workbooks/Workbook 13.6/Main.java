import java.util.Arrays;
import java.util.List;

/**
 * Main class
 */

public class Main {
    public static void main(String[] args) {

        // Transform each name into a greeting and print every greeting
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
        System.out.println("\n**************************************");
        names.stream()
            .map(name -> ("Hello, " + name + "!"))
            .forEach(name -> System.out.println(name));

        // Keep the username that matches the neon_ninja and return the first element in the stream
        System.out.println("\n**************************************");
        List<String> usernames = Arrays.asList("sparklingunicorn", "galactic_goddess", "neon_ninja", "purplepixiedust");
        String user = usernames.stream()
                .filter(username -> username.equals("neon_ninja"))
                .findFirst()
                .orElse(null);
        if (user == null) {
            System.out.println("Didn't find anything, this returned " + user);
        } else {
            System.out.println("Found you, " + user + "!");
        }

        // Keep the numbers that are even and count the number of elements in the stream
        System.out.println("\n**************************************");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        long numEven = numbers.stream()
                            .filter(number -> number % 2 == 0)
                            .count();        
        System.out.println("There are " + numEven + " even numbers in this list");
        
    }   
    
}


