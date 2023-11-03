import java.util.Scanner;

/**
 * Workbook 5.3 - Counting Tool
 * 
 * Timmy's having trouble counting. 
 * Let's build a Java app that will help him out.
 */

public class CountingTool {
    public static void main(String[] args) {

        // Create the Scanner
        Scanner scan = new Scanner(System.in);

        // Ask Timmy what number he'd like to count up to.
        System.out.print("\nHi, Timmy! Choose a number to count to: ");
        int number = scan.nextInt();

        // Count from 0 to the number Timmy chose
        System.out.println("\nGreat! Here's how it's done: ");
        for (int i=0 ; i<=number ; i++) {
            System.out.print(i + " ");
        }

        // Close the Scanner
        scan.close();
    }
}
