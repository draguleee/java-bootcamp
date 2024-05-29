package repository;

import java.util.HashMap;
import java.util.Map;

import pojo.Account;

/**
 * AccountRepository class 
 */

public class AccountRepository {

    // Instance variable (private) - data store
    private Map<String, Account> datastore = new HashMap<>();

    /**
     * createAccount() - inserts a new account in the data store
     * @param account
     */
    public void createAccount(Account account) {
        this.datastore.put(account.getId(), account.clone());
    }

    /**
     * retrieveAccount() - returns an account from the data store
     * @param id
     * @return
     */
    public Account retrieveAccount(String id) {
        return this.datastore.get(id).clone();
    }

    /**
     * updateAccount() - updates an existing account from the data source
     * @param account
     */
    public void updateAccount(Account account) {
        this.datastore.put(account.getId(), account.clone());
    }

    /**
     * deleteAccount() - deletes an account from the data source
     * @param id
     */
    public void deleteAccount(String id) {
        this.datastore.remove(id);
    }

}

