package service;

import java.math.BigDecimal;

/**
 * AccountService interface
 */

public interface AccountService {
    public void deposit(String id, BigDecimal amount);
    public void withdraw(String id, BigDecimal amount);
}