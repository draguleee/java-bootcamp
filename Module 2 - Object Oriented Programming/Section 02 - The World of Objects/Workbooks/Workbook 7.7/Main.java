/**
 * Main class - entry point of the application
 */

public class Main {
    public static void main(String[] args) {
 
        // Create a Person object
        Person person = new Person("Andre Dragu", "Romanian", "16/04/1999", 0);

        // Apply for passport 
        if (person.applyPassport() == true) {
            person.setPassport();
            person.chooseSeat();
        }

        // Print the object
        System.out.println(person);

    }
  
}
