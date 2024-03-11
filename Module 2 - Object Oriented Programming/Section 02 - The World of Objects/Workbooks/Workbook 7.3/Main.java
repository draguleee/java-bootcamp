 /*
  * Main class: entry point of the application
  */
 
 public class Main {
    public static void main(String[] args) {

        // Create a new Person object
        Person person = new Person("Andre Dragu", "Romanian", "16/04/1999", 5); 
        
        // Update the seat number before printing the fields
        person.setSeatNumber(10);

        // Display person's details
        System.out.println("\nName: " + person.getName());
        System.out.println("Nationality: " + person.getNationality());
        System.out.println("Date of birth: " + person.getDateOfBirth());
        System.out.println("Seat number: " + person.getSeatNumber());

    }
  
}
