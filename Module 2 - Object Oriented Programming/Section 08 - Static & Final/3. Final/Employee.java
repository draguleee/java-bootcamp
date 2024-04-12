/**
 * Employee class
 */

public class Employee {

    // Instance variables (private)
    private String name;
    private int age;

    // Static final constants (public)
    public static final int MIN_AGE = 18;
    public static final int MAX_AGE = 65;
    
    // Constructor with parameters
    public Employee(String name, int age) {
        setAge(age);
        setName(name);
    }

    // Getter for name
    public String getName() {
        return this.name;
    }
    
    // Setter for name
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("INVALID NAME");
        } else {
            this.name = name;
        }
    }

    // Getter for age
    public int getAge() {
        return this.age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age < MIN_AGE || age > MAX_AGE) {
            throw new IllegalArgumentException("INVALID AGE");
        } else {
            this.age = age;
        }
    }

}