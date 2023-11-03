import java.util.Scanner;

/**
 * Workbook 5.5 - Counter Tool revisited
 * 
 * Your app should let the user choose:
 * - The steps to count by
 * - A number to count from
 * - A number to count until
 */

public class CounterTool {
    public static void main(String[] args) {

        // Create the Scanner
        Scanner scan = new Scanner(System.in);

        // Start the dialogue?
        System.out.println("Me: I hear you like to count by threes");
        System.out.println("Jimmy: It depends.");
        System.out.println("Me: Oh, ok...\n");

        // Pick the numbers
        System.out.print("1. Pick a number to count by: ");
        int step = scan.nextInt();
        System.out.print("2. Pick a number to count from: ");
        int start = scan.nextInt();
        System.out.print("3. Pick a number to count to: ");
        int stop = scan.nextInt();

        // Check the values
        if(!checkValues(step, start, stop)) {
            System.out.println("\nError: Invalid values!");
            System.exit(0);
        } else {
            for (int i=start ; i<=stop ; i+=step) {
                System.out.print(i +  " ");
            }
        }

        // Close the Scanner
        scan.close();
    }

    /**
     * checkValues - checks if the entered values are correct
     * @param step  (int)
     * @param stop  (int)
     * @return boolean
     * 
     * Inside the function:
     * 1. Check if the step is smaller than stop
     */
    public static boolean checkValues(int step, int start, int stop) {
        return ((step < stop) && (start < stop) && (step >= 0));    
    }
}
