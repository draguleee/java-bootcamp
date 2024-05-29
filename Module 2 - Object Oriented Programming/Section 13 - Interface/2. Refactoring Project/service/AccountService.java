package service;

import java.math.BigDecimal;

/**
 * AccountService interface
 */

public interface AccountService {

    // Every class that signs the contract with AccountService interface must implement these methods
    public void deposit(String id, BigDecimal amount);
    public void withdraw(String id, BigDecimal amount);
    
}