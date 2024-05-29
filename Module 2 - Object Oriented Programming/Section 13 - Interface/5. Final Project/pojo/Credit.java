package pojo;

import java.math.BigDecimal;

/**
 * Credit class (Subclass)
 */

public class Credit extends Account {

    // Instance variable (private)
    private BigDecimal credit;

    // Constructor for Credit class
    public Credit(String id, BigDecimal credit) {
        super(id);
        this.credit = credit;
    }

    // Getter for credit
    public BigDecimal getCredit() {
        return this.credit;
    }

    // Setter for credt
    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    /**
     * clone() - clones an object of type Credit
     */
    @Override
    public Account clone() {
        return new Credit(super.getId(), this.credit);
    }
    

}
