/**
 * Main class: entry point of the app
 */
 
public class Main {
    public static void main(String[] args) {

        // Create a Person object
        Person person = new Person("Andre", "Romanian", "16/04/1999", 5); 

        // Create a new Person object with the Copy Constructor
        Person twin = new Person(person);
        twin.setName("Oana");
        twin.setSeatNumber(10);

        // Print both person's fields
        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");
        System.out.println("Name: " + twin.getName() + "\n" + "Nationality: " + twin.getNationality() + "\n" + "Date of Birth: " + twin.getDateOfBirth() + "\n" + "Seat Number: " + twin.getSeatNumber() + "\n");

    }
    
}
