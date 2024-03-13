/**
 * Airline class
 */

public class Airline {
    
    // Array that stores Person objects
    private Person[] people; 

    // Constructor with no parameters
    public Airline() {
        this.people = new Person[11];
    }

    // Getter for person
    public Person getPerson(int index) {
        return new Person(this.people[index]); 
    }

    // Setter for person
    public void setPerson(Person person) {
        this.people[person.getSeatNumber()-1] = new Person(person);
    }

    // Method to create reservation based on the seat number
    // Seat numbers can range from 1 - 11, whereas the index ranges from 0 - 10.
    public void createReservation(Person person) {
        while(people[person.getSeatNumber() - 1] != null) {
            System.out.println("\n" + person.getName() + ", seat: " + person.getSeatNumber() + " is already taken. Please choose another seat.\n");
            person.chooseSeat();
        }
        people[person.getSeatNumber() - 1] = new Person(person); 
        System.out.println("Thank you " + person.getName() + " for flying with Java airlines. Your seat number is " + person.getSeatNumber() + ".");
    }


}
