package pojo;

/**
 * Account abstract class (Superclass)
 */

public abstract class Account {

    // Instance variables (private)
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
     * clone() - clones an Account object; must be implemented by the subclasses
     */
    public abstract Account clone();

}
