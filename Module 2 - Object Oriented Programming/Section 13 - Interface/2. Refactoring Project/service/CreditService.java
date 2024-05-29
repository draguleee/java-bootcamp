package service;

import java.math.BigDecimal;

import pojo.Credit;
import repository.AccountRepository;

/**
 * CreditService interface
 */

public class CreditService implements AccountService {

    AccountRepository accountRepository;

    public CreditService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    /**
     * createAccount() - creates a new Credit object
     * @param account
     */
    public void createAccount(Credit account) {
        this.accountRepository.createAccount(account);
    }

    /**
     * retrieveAccount() - retrieves an existing Credit object
     * @param id
     * @return
     */
    public Credit retrieveAccount(String id) {
        return (Credit) this.accountRepository.retrieveAccount(id);
    }

    /**
     * updateAccount() - updates an existing Credit object
     * @param account
     */
    public void updateAccount(Credit account) {
        this.accountRepository.updateAccount(account);
    }

    /**
     * deleteAccount() - removes an existing Credit object
     * @param id
     */
    public void deleteAccount(String id) {
        this.accountRepository.deleteAccount(id);
    }

    @Override
    public void deposit(String id, BigDecimal amount) {
        Credit account = retrieveAccount(id);
        account.setCredit(account.getCredit().subtract(amount));
        updateAccount(account);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        Credit account = retrieveAccount(id);
        account.setCredit(account.getCredit().add(amount));
        updateAccount(account);
    }

}
