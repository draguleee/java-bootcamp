import java.util.Scanner;

/**
 * Main Class
 */

public class Main {

    public static void main(String[] args) {

        // Create the Scanner
        Scanner scanner = new Scanner(System.in);

        // Create new User object
        User user = new User();
        System.out.println("We are setting up your user account.");

        // Set the username
        System.out.print("Your username is currently " + user.getUsername() + ". Please update it here: ");
        String username = scanner.nextLine();
        if (username.isBlank()) {
            System.out.println("Sorry, that is invalid username!");
        } else {
            user.setUsername(username);
        }
        
        // Set the age
        System.out.print("Your age is currently " + user.getAge() + ". Please update it here: ");
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            if (age < 0) {
                System.out.println("Sorry, that is an invalid age!");
            } else {
                user.setAge(age);
            }
        } else {
            scanner.nextLine();
        }
        
        // Close the Scanner
        scanner.close();
    }     
}