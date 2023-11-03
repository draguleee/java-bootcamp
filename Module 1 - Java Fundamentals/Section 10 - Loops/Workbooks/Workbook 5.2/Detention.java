import java.util.Scanner;

/**
 * Workbook 5.2 - Detention
 * 
 * Bart's teacher wants him to write this line ninety-nine times:
 * " I will not forget semi-colons."
 */

public class Detention {
    public static void main(String[] args) {

        // Create the Scanner
        Scanner scan = new Scanner(System.in);

        // Ask Bart to enter the line
        System.out.println("\nHi Bart. I can write lines for you.");
        System.out.println("What do you want me to write?");
        String line = scan.nextLine();

        // Print the line 99 times
        for (int i=0 ; i<99 ; i++) {
            System.out.println((i+1) + ". " + line);
        }        
    }
}
