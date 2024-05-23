import java.io.*;
import java.nio.file.*;

/**
 * Main class
 */

public class Main {
    public static void main(String[] args) throws IOException {

        // Path to the file that we want to create the stream from
        Path path = Paths.get("emails.txt");

        // Create a stream of String elements from the data source
        // Eliminate the Spam emails and print the remaining emails
        System.out.println();
        Files.lines(path)
            .filter(email -> !email.startsWith("Spam"))
            .forEach(email -> System.out.println(email));
        
    }
}
