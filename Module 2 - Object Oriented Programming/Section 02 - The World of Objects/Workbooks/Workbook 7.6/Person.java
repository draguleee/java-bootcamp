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

    // Constructor
    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.passport = new String[3];
        this.seatNumber = seatNumber;
    }

    // Copy Constructor 
    public Person(Person source) {
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.passport = Arrays.copyOf(source.passport, source.passport.length);
        this.seatNumber = source.seatNumber;
    }

    // Getter & Setter for name
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    // Getter & Setter for nationality
    public String getNationality() { return nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }

    // Getter & Setter for date of birth
    public String getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    // Getter & Setter for seat number
    public int getSeatNumber() { return seatNumber; }
    public void setSeatNumber(int seatNumber) { this.seatNumber = seatNumber; }

    // Getter & Setter for passport
    public String[] getPassport() { return Arrays.copyOf(this.passport, this.passport.length); }
    public void setPassport() { this.passport = new String[] {name, nationality, dateOfBirth}; }

    /**
     * applyPassport() - function that determines if the user is eligible for a passport
     * @return
     */
    public boolean applyPassport() {
        int number = (int) (Math.random() * 2);
        return number == 1;
    }

    /**
     * chooseSeat() - function that chooses the seat for the passenger
     */
    public void chooseSeat() {
        seatNumber = ((int) (Math.random() * 11 + 1));
    }

 
}
