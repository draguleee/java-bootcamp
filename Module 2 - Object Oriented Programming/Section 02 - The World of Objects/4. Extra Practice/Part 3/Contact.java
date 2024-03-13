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

    // Constructor with parameters
    public Contact(String name, String phoneNumber, String birthDate) {
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
    public String getName() { return name; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getBirthDate() { return birthDate; }
    public int getAge() { return age; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        setAge(toAge(birthDate));
    }
    private void setAge(int age) { this.age = age; }

    /**
     * toAge() - converts the birthdate to LocalDate then converts it to years
     * @param birthDate
     * @return
     */
    public int toAge(String birthDate) {
        LocalDate parsedBirthDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(parsedBirthDate, currentDate);
        return period.getYears();
    }

}
