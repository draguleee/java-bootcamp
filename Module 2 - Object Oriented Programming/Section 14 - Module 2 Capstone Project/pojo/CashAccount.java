package pojo;

import java.math.BigDecimal;

/**
 * CashAccount class (Subclass)
 */

public class CashAccount extends TradeAccount {

    // Instance variable (private)
    private BigDecimal cashBalance;

    // Constructor for CashAccount class
    public CashAccount(String id, BigDecimal cashBalance) {
        super(id);
        this.cashBalance = cashBalance;
    }

    // Getter for cash balance
    public BigDecimal getCashBalance() {
        return this.cashBalance;
    }

    // Setter for cash balance
    public void setCashBalance(BigDecimal cashBalance) {
        this.cashBalance = cashBalance;
    }

    /**
     * clone() - clones a CashAccount object with the same ID and cashBalance
     */
    @Override
    public TradeAccount clone() {
        return new CashAccount(super.getId(), this.cashBalance);
    }

}
