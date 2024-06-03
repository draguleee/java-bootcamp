package service;

import java.math.BigDecimal;

/**
 * TradeAccountService interface
 */

public interface TradeAccountService {

    // Interface methods (signature only)
    public void deposit(String id, BigDecimal amount);
    public void withdraw(String id, BigDecimal amount);
}