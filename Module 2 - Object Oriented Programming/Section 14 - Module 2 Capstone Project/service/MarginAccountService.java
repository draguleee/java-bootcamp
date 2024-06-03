package service;

import java.math.BigDecimal;

import pojo.MarginAccount;
import repository.TradeAccountRepository;

/**
 * MarginAccountService class (implements TradeAccountService interface)
 */

public class MarginAccountService implements TradeAccountService {

    // Instance variable (private)
    private TradeAccountRepository repository;

    // Constructor fo MarginAccountService class
    public MarginAccountService(TradeAccountRepository repository) {
        this.repository = repository;
    }

    /**
     * createTradeAccount() - adds a new MarginAccount to the repository
     * @param marginAccount
     */
    public void createTradeAccount(MarginAccount marginAccount) {
        this.repository.createTradeAccount(marginAccount);
    }

    /**
     * retrieveTradeAccount() - returns a MarginAccount from the repository
     * @param id
     * @return
     */
    public MarginAccount retrieveTradeAccount(String id) {
        return (MarginAccount) this.repository.retrieveTradeAccount(id);
    }

    /**
     * updateTradeAccount() - updates a MarginAccount from the repository
     * @param marginAccount
     */
    public void updateTradeAccount(MarginAccount marginAccount) {
        this.repository.updateTradeAccount(marginAccount);
    }

    /**
     * deleteTradeAccount() - deletes a MarginAccount from the repository
     * @param id
     */
    public void deleteTradeAccount(String id) {
        this.repository.deleteTradeAccount(id);
    }

    /**
     * deposit() - add money to a MarginAccount with a specified ID
     */
    @Override
    public void deposit(String id, BigDecimal amount) {
        MarginAccount marginAccount = retrieveTradeAccount(id);
        marginAccount.setMargin(marginAccount.getMargin().add(amount));
        updateTradeAccount(marginAccount);
    }

    /**
     * withdraw() - withdraws amount from a MarginAccount with a specified ID
     */
    @Override
    public void withdraw(String id, BigDecimal amount) {
        MarginAccount marginAccount = retrieveTradeAccount(id);
        marginAccount.setMargin(marginAccount.getMargin().subtract(amount));
        updateTradeAccount(marginAccount);
    }

}