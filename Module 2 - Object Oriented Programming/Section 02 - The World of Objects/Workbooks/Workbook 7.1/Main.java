import java.util.Arrays;

/**
 * Main class: starting point of the app
 */

public class Main {
    public static void main(String[] args) {
        
        // Create one Person class
        Person andre = new Person();

        // Define the fields for the Person object
        andre.name = "Andre";
        andre.nationality = "Romanian";
        andre.dateOfBirth = "16.04.1999";
        andre.passport = new String[] { andre.name, andre.nationality, andre.dateOfBirth };
        andre.seatNumber = 17;

        // Print the Person object fields (details)
        System.out.println("\nName: " + andre.name);
        System.out.println("Nationality: " + andre.nationality);
        System.out.println("Date of birth: " + andre.dateOfBirth);
        System.out.println("Passport: " + Arrays.toString(andre.passport));
        System.out.println("Seat number: " + andre.seatNumber);
    }
}
