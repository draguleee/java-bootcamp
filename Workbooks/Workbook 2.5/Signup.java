import java.util.Scanner;

// Workbook 2.5

public class Signup {
    public static void main(String[] args) {
        
        // Create the Scanner
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to JavaGram! Let's sign you up.");
        
        // Request first name
        System.out.print("\nYour first name, please: ");
        String firstName = in.nextLine();
        
        // Request last name
        System.out.print("\nYour last name, please: ");
        String lastName = in.nextLine();

        // Request age
        System.out.print("\nYour age, please: ");
        int age = in.nextInt();
        in.nextLine();

        // Request username
        System.out.print("\nCreate an username, please: ");
        String username = in.nextLine();

        // Request home city
        System.out.print("\nThe city you live in, please: ");
        String city = in.nextLine();

        // Request country
        System.out.print("\nThe country you live in, please: ");
        String country = in.nextLine();

        // Print the information
        System.out.println("\nThank you for joining JavaGram!");
        System.out.println("Your information: ");
        System.out.println("\tFirst name: " + firstName);
        System.out.println("\tLast name: " + lastName);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + username);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);

        // Close the Scanner
        in.close();

    }

}