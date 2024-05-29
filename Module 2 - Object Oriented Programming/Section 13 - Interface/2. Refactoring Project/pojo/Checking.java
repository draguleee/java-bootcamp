package pojo;

import java.math.BigDecimal;

/**
 * Checking class (Subclass)
 */

public class Checking extends Account {

    // Instance variables (private)
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
     * clone() - clones a Checking object based on ID and balance
     */
    @Override
    public Account clone() {
        return new Checking(super.getId(), this.balance);
    }

}
