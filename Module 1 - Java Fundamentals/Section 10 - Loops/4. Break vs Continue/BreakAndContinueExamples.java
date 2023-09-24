/**
 * Break and Continue
 * 
 * break: breaks the loop entirely.
 * continue: skips a run in the loop, and continues to the next one.
 */

public class BreakAndContinueExamples {
    public static void main(String[] args) {
        // Example 1: Print numbers from 1 to 10, but stop when the number 5 is reached (using break)
        System.out.println("\nNumbers (1-10) with break: ");
        for(int i=1 ; i<11 ; i++) {
            if(i == 5) {
                break;
            }
            System.out.print(i + " ");
        }

        // Example 2: Print numbers from 1 to 10, but skip the number 5 (using continue)
        System.out.println("\n\nNumbers (1-10) with continue: ");
        for(int i=1 ; i<11 ; i++) {
            if(i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }

        // Example 3: Find the smallest number greater than 20 that is divisible by 3 (using break)
        System.out.print("\n\nSmallest number greater than 20, diisible by 3: ");
        for(int i=21; i<30 ; i++) {
            if(i % 3 == 0) {
                System.out.print(i);
                break;
            }
        }
        

        // Example 4: Print all even numbers from 1 to 20, and skip odd numbers (using continue)
        System.out.println("\n\nEven numbers");
        for(int i=1 ; i<21 ; i++) {
            if(i % 2 != 0) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
