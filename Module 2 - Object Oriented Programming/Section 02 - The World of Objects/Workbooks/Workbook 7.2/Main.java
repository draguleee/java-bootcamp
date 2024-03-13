import java.util.Arrays;
 
/**
 * Main class: entry point of the application
 */

public class Main {
  
    public static void main(String[] args) {
       
        // Create a Person object
        Person person = new Person("Andre", "Romanian", "16.04.1999", 80);
 
        
        System.out.println("Name: " + person.name + 
                            "\nNationality: " + person.nationality + 
                            "\nDate of birth: " + person.dateOfBirth +
                            "\nPassport: " + Arrays.toString(person.passport) + 
                            "\nSeat number: " + person.seatNumber);

    }
  
}
