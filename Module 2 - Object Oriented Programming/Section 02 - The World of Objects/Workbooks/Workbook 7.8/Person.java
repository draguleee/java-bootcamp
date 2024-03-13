import java.util.Arrays;
 
/**
 * Person class
 */

public class Person {
    
    // Instance variables (private)
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;
 
    // Constructor with parameters
    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
        this.passport = new String[3];
    }
 
    // Copy Constructor
    public Person(Person source) {
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
        this.passport = Arrays.copyOf(source.passport, source.passport.length);
    }
    
    // Getters
    public String getName() { return name; }
    public String getNationality() { return nationality; }
    public String getDateOfBirth() { return dateOfBirth; }
    public int getSeatNumber() { return seatNumber; }
 
    // Setters 
    public void setName(String name) { this.name = name; }
    public void setNationality(String nationality) { this.nationality = nationality; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public void setSeatNumber(int seatNumber) { this.seatNumber = seatNumber; }

    // Getter for passport
    public String[] getPassport() {
        return Arrays.copyOf(this.passport, this.passport.length);
    }

    // Setter for passport 
    public void setPassport() {
        this.passport = new String[] { this.name, this.nationality, this.dateOfBirth};
    }

    // Function to apply for passport
    public boolean applyPassport() {
        int number = (int) (Math.random() * 2);
        return number == 1;
    }

    // Function to choose a seat
    public void chooseSeat() {
        seatNumber = ((int) (Math.random() * 11 + 1));
    }

    // toString() method: displays the object as a String
    public String toString() {
        return "Name: " + name + "\n" + "Nationality: " + 
        nationality + "\n" + "Date of Birth: " + 
        dateOfBirth + "\n" + "Seat Number: " +
        seatNumber + "\n" + "Passport: " + 
        Arrays.toString(passport) + "\n";
    }

}
