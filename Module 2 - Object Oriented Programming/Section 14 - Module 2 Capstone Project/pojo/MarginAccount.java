package pojo;

import java.math.BigDecimal;

/**
 * MarginAccount class
 */

public class MarginAccount extends TradeAccount {

    // Instance variable (private)
    private BigDecimal margin;

    // Constructor for MarginAccount class
    public MarginAccount(String id, BigDecimal margin) {
        super(id);
        this.margin = margin;
    }

    // Getter for margin
    public BigDecimal getMargin() {
        return this.margin;
    }

    // Setter for margin
    public void setMargin(BigDecimal margin) {
        this.margin = margin;
    }

    @Override
    public TradeAccount clone() {
        return new MarginAccount(super.getId(), this.margin);
    }
}
