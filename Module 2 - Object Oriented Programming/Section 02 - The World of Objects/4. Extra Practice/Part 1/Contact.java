/**
 * Contact Class
 */

public class Contact {
    
    // Instance variables (private)
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    // Constructor with no parameters
    public Contact() {
        this.name = "Name";
        this.phoneNumber = "077XXXXXXX";
        this.birthDate = "16/04/1999";
        this.age = 25;
    }

    // Constructor with parameters
    public Contact(String name, String phoneNumber, String birthDate, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = age;
    }

    // Copy constructor
    public Contact(Contact source) {
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;
    }


}
