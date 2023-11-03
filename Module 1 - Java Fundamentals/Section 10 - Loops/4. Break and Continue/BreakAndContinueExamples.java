/**
 * Break & Continue keywords
 * 
 * The road so far:
 * - For loop: run code a specific number of times
 * - While loop: run code an unknown number of times
 * - Break & Continue: gain full control over your loops
 * 
 * continue keyword: skips a run and jumps to the next one
 * 
 * break: breaks the loop entirely.
 */

public class BreakAndContinueExamples {

    public static void main(String[] args) {

        // Example 1: Print numbers from 1 to 10, but stop when the number 5 is reached (using break)
        System.out.print("\nNumbers from 1-10, stop when 5 is reached: ");
        for(int i=1 ; i<=10 ; i++) {
            if(i == 5) {
                break;
            }
            System.out.print(i + " ");
        }

        // Example 2: Print numbers from 1 to 10, but skip the number 5 (using continue)
        System.out.print("\nNumbers from 1-10, skip 5: ");
        for(int i=1 ; i<=10 ; i++) {
            if(i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }

        // Example 3: Find the smallest number greater than 20 that is divisible by 3 (using break)
        System.out.print("\nSmallest number greater than 20, divisible by 3 is ");
        for(int i=21 ; i<30 ; i++) {
            if(i % 3 == 0) {
                System.out.print(i);
                break;
            }
        }

        // Example 4: Print all even numbers from 1 to 20, and skip odd numbers (using continue)
        System.out.print("\nEven numbers from 1-20: ");
        for(int i=1 ; i<=20 ; i++) {
            if(i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }

    }
}
