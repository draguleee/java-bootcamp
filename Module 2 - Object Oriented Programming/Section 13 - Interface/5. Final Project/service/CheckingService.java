package service;

import java.math.BigDecimal;

import pojo.Checking;
import repository.AccountRepository;

/**
 * CheckingService class (implements AccountService interface)
 */

public class CheckingService implements AccountService {

    // Instance variable (private) - repository
    private AccountRepository repository;

    /**
     * deposit() - add money to a Checking account with a specified ID
     */
    @Override
    public void deposit(String id, BigDecimal amount) {
        Checking account = retrieveAccount(id);
        account.setBalance(account.getBalance().add(amount));
        updateAccount(account);
    }

    /**
     * withdraw() - withdraws amount from a Checking account with a specified ID
     */
    @Override
    public void withdraw(String id, BigDecimal amount) {
        Checking account = retrieveAccount(id);
        account.setBalance(account.getBalance().subtract(amount));
        updateAccount(account);
    }

    // Constructor for CheckingService class
    public CheckingService(AccountRepository repository) {
        this.repository = repository;
    }

    /**
     * createAccount() - creates a Checking account
     * @param account
     */
    public void createAccount(Checking account) {
        this.repository.createAccount(account);
    }

    /**
     * retrieveAccount() - returns a Checking account
     * @param id
     * @return
     */
    public Checking retrieveAccount(String id) {
        return (Checking)this.repository.retrieveAccount(id);
    }

    /**
     * updateAccount() - updates a Checking account
     * @param account
     */
    public void updateAccount(Checking account) {
        this.repository.updateAccount(account);
    }

    /**
     * deleteAccount() - deletes a Checking account
     * @param id
     */
    public void deleteAccount(String id) {
        this.repository.deleteAccount(id);
    }

}