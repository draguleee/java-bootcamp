/**
 * User Class
 */

public class User {

    // Instance variables (private)
    private String username;
    private int age;

    // Getter for age
    public int getAge() { return this.age; }

    // Setter for age
    public void setAge(int age) { 
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative!");
        }
        this.age = age;
    }

    // Getter for username
    public String getUsername() { return this.username; }

    // Setter for username
    public void setUsername(String username) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username cannot be null or blank!");
        }
        this.username = username;
    }


}
