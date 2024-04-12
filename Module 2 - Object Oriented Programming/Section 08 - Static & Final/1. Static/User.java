/**
 * User class
 */

public class User {

    // Instance variables (private)
    private String firstName;
    private String lastName;

    // Static variables (private)
    private static int userCount = 0;

    // Constructor with parameters
    public User(String firstName, String lastName) {
        userCount++;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter for first name
    public String getFirstName() {
        return this.firstName;
    }

    // Setter for first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter for last name
    public String getLastName() {
        return this.lastName;
    }

    // Setter for last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter for user count
    public static int getUserCount() {
        return userCount;
    }

}