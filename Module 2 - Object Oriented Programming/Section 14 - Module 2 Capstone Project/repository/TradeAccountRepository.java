package repository;

import java.util.*;

import pojo.TradeAccount;

/**
 * TradeAccountRepository class
 */

public class TradeAccountRepository {

    // Instance variable (private)
    private Map<String, TradeAccount> datastore = new HashMap<>();

    /**
     * createTradeAccount() - adds a TradeAccount object in the datastore
     * @param tradeAccount
     */
    public void createTradeAccount(TradeAccount tradeAccount) {
        this.datastore.put(tradeAccount.getId(), tradeAccount.clone());
    }

    /**
     * retrieveTradeAccount() - returns a TradeAccount object from the datastore
     * @param id
     * @return
     */
    public TradeAccount retrieveTradeAccount(String id) {
        return this.datastore.get(id) == null ? null : this.datastore.get(id).clone();
    }

    /**
     * updateTradeAccount() - updates a TradeAccount object from the datastore
     * @param tradeAccount
     */
    public void updateTradeAccount(TradeAccount tradeAccount) {
        this.datastore.put(tradeAccount.getId(), tradeAccount.clone());
    }

    /**
     * deleteTradeAccount() - deletes a TradeAccount object from the datastore
     * @param id
     */
    public void deleteTradeAccount(String id) {
        this.datastore.remove(id);
    }
}
