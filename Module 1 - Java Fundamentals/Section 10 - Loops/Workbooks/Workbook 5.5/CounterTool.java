import java.util.Scanner;

import javax.sound.midi.SysexMessage;

/**
 * Workbook 5.5 - Counter Tool
 * 
 * Counter Tool - Revisited.
 * Your app should let the ueer choose:
 * - The steps to count by.
 * - A number to count from.
 * - A number to count until.
 * 
 * Your program will count from the second number to the third number, in
 * steps of the first.
 */

public class CounterTool {
    public static void main(String[] args) {

        // Create the Scanner
        Scanner scan = new Scanner(System.in);

        // Start the program
        System.out.println("\nMe: I hear you like to count by threes.");
        System.out.println("Jimmy: It depends.");
        System.out.println("Me: Oh, ok...");

        // Pick a number to count by
        System.out.print("\nPick a number to count by: ");
        int countBy = scan.nextInt();

        // Pick a number to start counting from
        System.out.print("Pick a number to start counting from: ");
        int countFrom = scan.nextInt();

        // Pick a number to count to
        System.out.print("Pick a number to count to: ");
        int countTo = scan.nextInt();

        // Count
        for (int i=countFrom ; i<=countTo ; i+=countBy) {
            System.out.print(i + " ");
        }

        // Close the Scanner
        scan.close();
    }
}
