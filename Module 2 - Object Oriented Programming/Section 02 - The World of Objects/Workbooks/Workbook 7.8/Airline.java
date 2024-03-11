import java.util.Arrays;

/**
 * Airline class
 */

public class Airline {
    
    // Array that stores Person objects
    private Person[] people; 

    // Constructor without parameters
    public Airline() {
        this.people = new Person[11];
    }

    // Getter for person
    public Person getPerson(int index) {
        return new Person(this.people[index]);
    }

    // Setter for person
    public void setPerson(Person person) {
        this.people[person.getSeatNumber() - 1] = new Person(person);
    }

}
