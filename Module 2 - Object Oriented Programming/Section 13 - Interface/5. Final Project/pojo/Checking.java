package pojo;

import java.math.BigDecimal;

/**
 * Checking class (Subclass)
 */

public class Checking extends Account {

    // Instance variable (private)
    private BigDecimal balance;

    // Constructor for Checking class
    public Checking(String id, BigDecimal balance) {
        super(id);
        this.balance = balance;
    }

    // Getter for balance
    public BigDecimal getBalance() {
        return this.balance;
    }

    // Setter for balance
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * clone() - clones an object of type Checking 
     */
    @Override
    public Account clone() {
        return new Checking(super.getId(), this.balance);
    }

}