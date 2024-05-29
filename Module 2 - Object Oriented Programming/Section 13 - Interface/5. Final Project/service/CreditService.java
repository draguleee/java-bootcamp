package service;

import java.math.BigDecimal;

import pojo.Credit;
import repository.AccountRepository;

/**
 * CreditService class (implements AccountService interface)
 */

public class CreditService implements AccountService {

    // Instance variable (private) - repository
    private AccountRepository repository;

    /**
     * deposit() - add money to a Credit account with a specified ID
     */
    @Override
    public void deposit(String id, BigDecimal amount) {
        Credit account = retrieveAccount(id);
        account.setCredit(account.getCredit().subtract(amount));
        updateAccount(account);   
    }
    
    /**
     * withdraw() - withdraws amount from a Credit account with a specified ID
     */
    @Override
    public void withdraw(String id, BigDecimal amount) {
        Credit account = retrieveAccount(id);
        account.setCredit(account.getCredit().add(amount));
        updateAccount(account);           
    }

    // Constructor for CreditService class
    public CreditService(AccountRepository repository) {
        this.repository = repository;
    }

    /**
     * createAccount() - creates a Credit account
     * @param account
     */
    public void createAccount(Credit account) {
        this.repository.createAccount(account);
    }

    /**
     * retrieveAccount() - returns a Credit account
     * @param id
     * @return
     */
    public Credit retrieveAccount(String id) {
        return (Credit)this.repository.retrieveAccount(id);
    }

    /**
     * updateAccount() - updates a Credit account
     * @param account
     */
    public void updateAccount(Credit account) {
        this.repository.updateAccount(account);
    }

    /**
     * deleteAccount() - deletes a Credit account
     * @param id
     */
    public void deleteAccount(String id) {
        this.repository.deleteAccount(id);
    }

}