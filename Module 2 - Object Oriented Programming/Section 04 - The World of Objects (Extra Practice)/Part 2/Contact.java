import java.security.Permissions;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Contact Class
 */

public class Contact {

    // Instance variables (private)
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    // Constructor with parameyters
    public Contact(String name, String phoneNumber, String birthDate, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = toAge(birthDate);
    }

    // Copy constructor
    public Contact(Contact source) {
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;
    }

    // Getters
    public String getName() { return this.name; }
    public String getPhoneNumber() { return this.phoneNumber; }
    public String getBirthDate() { return this.birthDate; }
    public int getAge() { return this.age; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setBirthDate(String birthDate) { this.birthDate = birthDate; }
    public void setAge(int age) { this.age = age; }

    // toString() method - prints the COntact objects as String
    @Override
    public String toString() {
        return this.name + " : " + this.phoneNumber + " : " + this.birthDate + " : " + this.age;
    }

    /**
     * toAge() - converts a String date to LocalDate and converts the LocalDate to age
     */
    public int toAge(String birthDate) {

        // Parse the birthDate string to a LocalDate
        LocalDate formattedBirthDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the period between the date of birth and the current date
        Period period = Period.between(formattedBirthDate, currentDate);

        // Return the age as the difference in years
        return period.getYears();

    }

}
