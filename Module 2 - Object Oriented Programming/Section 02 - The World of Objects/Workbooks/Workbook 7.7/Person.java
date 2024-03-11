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
 
    // Constructor for Person class
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
    public String[] getPassport() { return Arrays.copyOf(passport, passport.length); }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setNationality(String nationality) { this.nationality = nationality; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public void setSeatNumber(int seatNumber) { this.seatNumber = seatNumber; }
    public void setPassport() { this.passport = new String[] {name, nationality, dateOfBirth}; }

    // Method to apply for a passport
    public boolean applyPassport() {
        int number = (int) (Math.random() * 2);
        return number == 1;
    }

    // Method to choose a seat from the plane
    public void chooseSeat() {
        seatNumber = ((int) (Math.random() * 11 + 1));
    }

    // toString() method - prints the object as a String
    public String toString() {
        return "\nName: " + this.name + 
                "\nNationality: " + this.nationality + 
                "\nDate of birth: " + this.dateOfBirth + 
                "\nSeat number: " + this.seatNumber + 
                "\nPassport: " + Arrays.toString(this.passport);
    }
}
