import java.util.Scanner;

/**
 * Workbook 5.9 - JavaGram
 * Samantha will sign into her favourite social network: JavaGram.
 */

public class SignIn {
    public static void main(String[] args) {

        // String variables for username and password
        String username = "Samantha";
        String password = "Java <3";
        
        // Pick up a username and a password
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below.\n");
        System.out.print("- Username: ");
        String chosenUsername = scan.nextLine();
        System.out.print("- Password: ");
        String chosenPassword = scan.nextLine();

        // Set up a loop that keeps running while the username OR password is incorrect.
        while((!chosenUsername.equals(username)) || (!chosenPassword.equals(password))) {
            System.out.print("\nIncorrect credentials!");
            System.out.println("Please try again: ");
            System.out.print("- Username: ");
            chosenUsername = scan.nextLine();
            System.out.print("- Password: ");
            chosenPassword = scan.nextLine();
        }
        System.out.println("\nSign in successful. Welcome, " + username + "!");
        scan.close();
        
    }
}
