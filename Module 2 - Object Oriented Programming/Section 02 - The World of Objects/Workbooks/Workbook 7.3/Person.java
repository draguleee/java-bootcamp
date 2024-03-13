/**
 * Person class
 */

public class Person {
    
    // Instance variables (private fields)
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    // Constructor with parameters for Person class
    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
    }

    // Getter & Setter for name
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    // Getter & Setter for nationality
    public String getNationality() { return this.nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }

    // Getter & Setter for date of birth
    public String getDateOfBirth() { return this.dateOfBirth; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    // Getter & Setter for passport
    // TODO

    // Getter & Setter for seat number
    public int getSeatNumber() { return this.seatNumber; }
    public void setSeatNumber(int seatNumber) { this.seatNumber = seatNumber; }
 
}
