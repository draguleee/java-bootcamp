/**
 * For Loops:
 * - Execute code a specific number of times
 * - Has three parts:
 *   * start: i = 0;
 *   * stop: i < n;
 *   * step: i++
 * => for (int i=0 ; i<n ; i++) { }
 */

public class ForLoopExamples {

    public static void main(String[] args) {

        // Example 1: Print numbers from 1 to 10
        System.out.println("\nNumbers from 1 to 10: ");
        for (int i=1 ; i<11 ; i++) {
            System.out.print(i + " ");
        }
        // Example 2: Print "Hello, world!" 5 times
        System.out.println("\nHello World 5 times");
        for (int i=0 ; i<5 ; i++) {
            System.out.println(i + ": Hello, world!");
        }

        // Example 3: Print the multiplication table of 5 up to 10 (5*1, 5*2, ...)
        System.out.println("\nMultiplication table: ");
        for (int i=1 ; i<11 ; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }

        // Example 4: Print the numbers from 10 to 1 in reverse order
        System.out.println("\nNumbers from 1 to 10 in reverse order: ");
        for (int i=10 ; i>0 ; i--) {
            System.out.print(i + " ");
        }

        // Example 5: Print the first 10 even numbers
        System.out.println("\n\nFirst 10 even numbers");
        for (int i=0 ; i<20 ; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
