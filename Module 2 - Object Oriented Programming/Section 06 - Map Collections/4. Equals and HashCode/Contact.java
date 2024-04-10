import java.util.Objects;

/**
 * Contact class
 */

public class Contact {

    // Instance variables (private)
    private String name;
    private int age;

    // Constructor with parameters
    public Contact(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Contact(Contact source) {
        this.name = source.name;
        this.age = source.age;
    }

    // Getters
    public String getName() { return this.name; }
    public int getAge() { return this.age; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    // Equals method
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Contact)) {
            return false;
        }
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && age == contact.age;
    }

    // HashCode method
    public int hashCode() {
        return Objects.hash(name, age);
    }


}
