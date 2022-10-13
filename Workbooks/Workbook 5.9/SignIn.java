import java.util.Scanner;

// Workbook 5.8

public class SignIn {
    public static void main(String[] args) {

        // Create the Scanner
        Scanner in = new Scanner(System.in);
        
        // The user's credentials
        String username = "Andre";
        String password = "iloverosies";

        // Pick up a username and a password from the user
        System.out.println("\nWelcome to JavaGram! Sign in below.\n");
        System.out.print("- Username: ");
        String inputUsername = in.nextLine();
        System.out.print("  Password: ");
        String inputPassword = in.nextLine();

        // Set up a loop that keeps running while the username OR the password is incorrect
        while(!inputUsername.equals(username) || !inputPassword.equals(password)) {
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("• Username: ");
            inputUsername = in.nextLine();
            System.out.print("• Password: ");
            inputPassword = in.nextLine();
        }
        System.out.println("\nSign in successful. Welcome!");

        // Close the Scanner
        in.close();

    }
    
}
