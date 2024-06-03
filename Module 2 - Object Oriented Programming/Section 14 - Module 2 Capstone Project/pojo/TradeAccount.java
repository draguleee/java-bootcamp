package pojo;

/**
 * TradeAccount class (Superclass)
 */

public abstract class TradeAccount {

    // Instance variable (private)
    private String id;

    // Constructor for TradeAccount class
    public TradeAccount(String id) {
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
     * clone() - clones a TradeAccount object; must be implemented by the subclasses
     */
    public abstract TradeAccount clone();
}