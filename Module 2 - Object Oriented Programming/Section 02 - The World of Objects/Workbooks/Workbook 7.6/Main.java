import java.util.Arrays;

/**
 * Main class: entry point of the application
 */

public class Main {
  
    public static void main(String[] args) {

        // Create a Person object
        Person person = new Person("Andre Dragu", "Romanian", "16/04/1999", 5); 
        
        // Determine if the person is eligible for a passport
        if (person.applyPassport() == true) {
            person.setPassport();
        }

        // Print the person's details
        System.out.println("\nName: " + person.getName() + 
                            "\nNationality: " + person.getNationality() + 
                            "\nDate of Birth: " + person.getDateOfBirth() + 
                            "\nSeat Number: " + person.getSeatNumber() + 
                            "\nPassport: " + Arrays.toString(person.getPassport()));
    
    }
     
}
