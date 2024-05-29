package repository;

import java.util.HashMap;
import java.util.Map;

import pojo.Account;

/**
 * AccountRepository class
 */

public class AccountRepository {

    // Only the AccountRepository can access the datastore!
    private Map<String, Account> datastore = new HashMap<>();

    /**
     * createAccount() - creates a new Account object
     * @param account
     */
    public void createAccount(Account account) {
        this.datastore.put(account.getId(), account.clone());
    }

    /**
     * retrieveAccount() - retrieves an existing Account object
     * @param id
     * @return
     */
    public Account retrieveAccount(String id) {
        return this.datastore.get(id).clone();
    }

    /**
     * updateAccount() - updates an existing Account object
     * @param account
     */
    public void updateAccount(Account account) {
        this.datastore.put(account.getId(), account.clone());
    }

    /**
     * deleteAccount() - removes an existing Account object
     * @param id
     */
    public void deleteAccount(String id) {
        this.datastore.remove(id);
    }

}

