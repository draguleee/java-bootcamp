import java.util.Scanner;

/**
 * Workbook 5.9 - JavaGram
 * 
 * Samantha will sign into her favourite social network - JavaGram!
 * 
 * !!! NOTE !!!
 * while (!condition1 || !condition 2) === while (!(condition1 && condition2)) 
 */

public class SignIn {
    public static void main(String[] args) {

        // Create the Scanner
        Scanner scan = new Scanner(System.in);

        // The stored username and password for Samantha
        String username = "Samantha";       
        String password = "Java <3";

        // Pick up the username and password from the user
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("- Username: ");
        String inputUsername = scan.nextLine();
        System.out.print("- Password: ");
        String inputPassword = scan.nextLine();
        
        // Set up a loop that keeps running while the username OR password is incorrect
        while(!inputUsername.equals(username) || !inputPassword.equals(password)) {
            System.out.println("\nIncorrect. Please try again!");
            System.out.print("- Username: ");
            inputUsername = scan.nextLine();
            System.out.print("- Password: ");
            inputPassword = scan.nextLine();
        }
        System.out.println("\nSign in successful. Welcome, " + username + "!");

        // Close the Scanner
        scan.close();
        
    }
}
