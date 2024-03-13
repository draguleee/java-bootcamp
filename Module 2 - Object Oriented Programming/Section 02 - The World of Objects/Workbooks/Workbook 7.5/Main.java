/**
 * Person class
 */

public class Main {
  
    public static void main(String[] args) {

        // Create a Person object
        Person person = new Person("Andre Dragu", "Romanian", "16/04/1999", 5); 
        person.chooseSeat();

        // Print the passenger's fields
        System.out.println("\nName: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");

        // See if the passenger is eligible for passport
        if(person.applyPassport()) {
            System.out.println("Congratulations " + person.getName() + ". Your passport was approved!");
        } else {
            System.out.println("We are sorry " + person.getName() + ". We cannot process your application.");
        }

    }  
  
}
