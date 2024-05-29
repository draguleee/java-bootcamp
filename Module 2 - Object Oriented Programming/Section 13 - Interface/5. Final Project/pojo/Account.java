package pojo;

/**
 * Account class (Superclass)
 */

public abstract class Account {

    // Instance variable (private - will be inherited by subclasses)
    private String id;

    // Constructor for Account class
    public Account(String id) {
        this.id = id;
    }

    // Getter for ID
    public String getId() {
        return this.id;
    }

    // Setter for ID
    public void setId(String id) {
        this.id = id;
    }

    /**
     * clone() - clones an object of Account type; must be implemented by its subclasses
     */
    public abstract Account clone();

}
