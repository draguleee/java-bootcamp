package service;

import java.math.BigDecimal;

import pojo.CashAccount;
import repository.TradeAccountRepository;

/**
 * CashAccountService (implements TradeAccountService interface)
 */

public class CashAccountService implements TradeAccountService {
    
    // Instance variable (private)
    private TradeAccountRepository repository;

    // Constructor for CashAccountService class
    public CashAccountService(TradeAccountRepository repository) {
        this.repository = repository;
    }

    /**
     * createTradeAccount() - adds a new CashAccount to the repository
     * @param tradeAccount
     */
    public void createTradeAccount(CashAccount cashAccount) {
        this.repository.createTradeAccount(cashAccount);
    }

    /**
     * retrieveTradeAccount() - returns a CashAccount from the repository based on the specified ID
     * @param id
     * @return
     */
    public CashAccount retrieveTradeAccount(String id) {
        return (CashAccount) this.repository.retrieveTradeAccount(id);
    }

    /**
     * updateTradeAccount() - updates CashAccount from the repository
     * @param tradeAccount
     */
    public void updateTradeAccount(CashAccount cashAccount) {
        this.repository.updateTradeAccount(cashAccount);
    }

    /**
     * deleteTradeAccount() - deletes a CashAccount from the repository
     * @param id
     */
    public void deleteTradeAccount(String id) {
        this.repository.deleteTradeAccount(id);
    }

    /**
     * deposit() - add money to a CashAccount with a specified ID
     */
    @Override
    public void deposit(String id, BigDecimal amount) {
        CashAccount cashAccount = retrieveTradeAccount(id);
        cashAccount.setCashBalance(cashAccount.getCashBalance().add(amount));
        updateTradeAccount(cashAccount);   
    }

    /**
     * withdraw() - withdraws amount from a CashAccount with a specified ID
     */
    @Override
    public void withdraw(String id, BigDecimal amount) {
        CashAccount cashAccount = retrieveTradeAccount(id);
        cashAccount.setCashBalance(cashAccount.getCashBalance().subtract(amount));
        updateTradeAccount(cashAccount);
    }

}
