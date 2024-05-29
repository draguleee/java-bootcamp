package service;

import java.math.BigDecimal;

import pojo.Checking;
import repository.AccountRepository;

/**
 * CheckingService interface
 */

public class CheckingService implements AccountService {
        
    AccountRepository accountRepository;

    public CheckingService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    /**
     * createAccount() - creates a new Checking object
     * @param account
     */
    public void createAccount(Checking account) {
        this.accountRepository.createAccount(account);
    }

    /**
     * retrieveAccount() - retrieves an existing Checking object
     * @param id
     * @return
     */
    public Checking retrieveAccount(String id) {
        return (Checking) this.accountRepository.retrieveAccount(id);
    }

    /**
     * updateAccount() - updates an existing Checking object
     * @param account
     */
    public void updateAccount(Checking account) {
        this.accountRepository.updateAccount(account);
    }

    /**
     * deleteAccount() - removes an existing Checking object
     * @param id
     */
    public void deleteAccount(String id) {
        this.accountRepository.deleteAccount(id);
    }

    @Override
    public void deposit(String id, BigDecimal amount) {
        Checking account = retrieveAccount(id);
        account.setBalance(account.getBalance().add(amount));
        updateAccount(account);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        Checking account = retrieveAccount(id);
        account.setBalance(account.getBalance().subtract(amount));
        updateAccount(account);
    }

}
