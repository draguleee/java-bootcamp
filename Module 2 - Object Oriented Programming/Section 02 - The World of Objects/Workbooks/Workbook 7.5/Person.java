/**
 * Main class: entry point of the application
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
    }

    // Copy Constructor
    public Person(Person source) {
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
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
 
    /**
     * applyPassport() - function that establishes if the passenger is eligible for passport
     * @return (boolean)
     */
    public boolean applyPassport() {
        int number = (int)(Math.random() * 2);      // 0 1 
        switch (number) {
            case 0: return false;
            case 1: return true;
        }
        return false;
    }

    /**
     * chooseSeat() - function that chooses a seat for a passenger
     */
    public void chooseSeat() {
        this.seatNumber = (int)(Math.random() * 11 + 1);
    }
}
