import java.util.Scanner;

/**
 * Workbook 5.2 - Detention
 */

public class Detention {
    public static void main(String[] args) {

        // Create the Scanner
        Scanner in = new Scanner(System.in);

        // Prompt Bart to enter the line to be written 99 times.
        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        String line = in.nextLine();
        
        // Print the line 99 times
        for (int i=0 ; i<99 ; i++) {
            System.out.println((i+1) + ": " + line);
        }
    }
}
