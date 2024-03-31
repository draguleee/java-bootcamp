import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * ExampleOne Class
 */

public class ExampleOne {
    public static void main(String[] args) {
        try {

            // Create a FileInputStream using the greetings.txt file
            FileInputStream fis = new FileInputStream("greetings.txt");
        
            // Create a Scanner
            Scanner scan = new Scanner(fis);

            // Print the content of the greetings.txt file
            System.out.println(scan.nextLine());

            // Close the Scanner
            scan.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Process Complete.");
        }

    }
    
}