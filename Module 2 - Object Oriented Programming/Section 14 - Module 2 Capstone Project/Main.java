import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import constants.Transaction;
import pojo.*;
import repository.*;
import service.*;

import static constants.TradeAccountType.*;

/**
 * Main class
 */

public class Main {

    // Path to the accounts.txt ad transactions.txt files
    static Path[] paths = new Path[] {Paths.get("data/accounts.txt"), Paths.get("data/transactions.txt")};

    // Create a TradeAccountRepository object
    static TradeAccountRepository tradeAccountRepository = new TradeAccountRepository();
    
    // Create a CashAccountService object based on the TradeAccountRepository object
    static CashAccountService cashAccountService = new CashAccountService(tradeAccountRepository);
    
    // Create a MarginAccountService object based on the TradeAccountRepository object
    static MarginAccountService marginAccountService = new MarginAccountService(tradeAccountRepository);


    public static void main(String[] args) {


        /************************** PART 1 **************************/

        // System.out.println("\n-------------------------------\n");

        // Create a CashAccount object
        // CashAccount cashAccount = new CashAccount("C123", new BigDecimal("1000.00"));
        // System.out.println("Cash Account Details:");
        // System.out.println("ID: " + cashAccount.getId());
        // System.out.println("Cash Balance: " + cashAccount.getCashBalance());

        // System.out.println("\n-------------------------------\n");

        // // Create a copy of the previously created CashAccount object
        // CashAccount clonedCashAccount = (CashAccount) cashAccount.clone();
        // System.out.println("Cloned Cash Account Details:");
        // System.out.println("ID: " + clonedCashAccount.getId());
        // System.out.println("Cash Balance: " + clonedCashAccount.getCashBalance());

        // System.out.println("\n-------------------------------\n");

        // // Create a MarginAccount object
        // MarginAccount marginAccount = new MarginAccount("M456", new BigDecimal("5000.00"));
        // System.out.println("Margin Account Details:");
        // System.out.println("ID: " + marginAccount.getId());
        // System.out.println("Margin: " + marginAccount.getMargin());

        // System.out.println("\n-------------------------------\n");

        // // Create a copy of the previously created MarginAccount object
        // MarginAccount clonedMarginAccount = (MarginAccount) marginAccount.clone();
        // System.out.println("Cloned Margin Account Details:");
        // System.out.println("ID: " + clonedMarginAccount.getId());
        // System.out.println("Margin: " + clonedMarginAccount.getMargin());


        /************************** PART 2 **************************/

        // // Create a TradeAccountRepository object (datastore / repository)
        // TradeAccountRepository repository = new TradeAccountRepository();
    
        // // Create a CashAccount object and add it to the TradeAccountRepository datastore
        // CashAccount cashAccount = new CashAccount("C123", new BigDecimal("1000.00"));
        // repository.createTradeAccount(cashAccount);
        
        // // Create a MarginAccount object and add it to the TradeAccountRepository datastore
        // MarginAccount marginAccount = new MarginAccount("M456", new BigDecimal("5000.00"));
        // repository.createTradeAccount(marginAccount);
        
        // // Test the retrieval of the CashAccount from the TradeAccountRepository datastore
        // System.out.println("\n-------------------------------\n");
        // TradeAccount retrievedCashAccount = repository.retrieveTradeAccount("C123");
        // System.out.println("Retrieved Cash Account ID: " + retrievedCashAccount.getId());
        // System.out.println("Cash Balance: " + ((CashAccount) retrievedCashAccount).getCashBalance());
        
        // // Test the retrieval of the MarginAccount from the TradeAccountRepository datastore
        // System.out.println("\n-------------------------------\n");
        // TradeAccount retrievedMarginAccount = repository.retrieveTradeAccount("M456");
        // System.out.println("Retrieved Margin Account ID: " + retrievedMarginAccount.getId());
        // System.out.println("Margin: " + ((MarginAccount) retrievedMarginAccount).getMargin());

        // // Update the cash account
        // ((CashAccount) retrievedCashAccount).setCashBalance(new BigDecimal("1500.00"));
        // repository.updateTradeAccount(retrievedCashAccount);

        // // Verify that the cash account was updated
        // retrievedCashAccount = repository.retrieveTradeAccount("C123");
        // System.out.println("Updated Cash Balance: " + ((CashAccount) retrievedCashAccount).getCashBalance());

        // // Delete the margin account
        // repository.deleteTradeAccount("M456");

        // // Verify that the margin account was deleted
        // retrievedMarginAccount = repository.retrieveTradeAccount("M456");
        // if (retrievedMarginAccount == null) {
        //     System.out.println("Margin account successfully deleted.");
        // } else {
        //     System.out.println("Margin account deletion failed.");
        // }


        /************************** PART 3 **************************/

        // // Create a TradeAccountRepository object
        // TradeAccountRepository repository = new TradeAccountRepository();
        
        // // Create a CashAccountService and a MarginAccountService
        // CashAccountService cashAccountService = new CashAccountService(repository);
        // MarginAccountService marginAccountService = new MarginAccountService(repository);
        
        // // Create CashAccount and MarginAccount objects
        // CashAccount cashAccount = new CashAccount("1", BigDecimal.valueOf(1000));
        // MarginAccount marginAccount = new MarginAccount("2", BigDecimal.valueOf(2000));
            
        // // Add the accounts to the repository
        // cashAccountService.createTradeAccount(cashAccount);
        // marginAccountService.createTradeAccount(marginAccount);
        
        // // Deposit and withdraw amounts
        // cashAccountService.deposit("1", BigDecimal.valueOf(500));
        // cashAccountService.withdraw("1", BigDecimal.valueOf(200));
        // marginAccountService.deposit("2", BigDecimal.valueOf(1000));
        // marginAccountService.withdraw("2", BigDecimal.valueOf(500));
        
        // // Retrieve and print the updated account balances
        // CashAccount updatedCashAccount = cashAccountService.retrieveTradeAccount("1");
        // MarginAccount updatedMarginAccount = marginAccountService.retrieveTradeAccount("2");
        // System.out.println("Updated CashAccount balance: " + updatedCashAccount.getCashBalance());
        // System.out.println("Updated MarginAccount margin: " + updatedMarginAccount.getMargin());
        
        // // Delete the accounts
        // cashAccountService.deleteTradeAccount("1");
        // marginAccountService.deleteTradeAccount("2");


        /************************** PART 4 **************************/

        // Call the loadTradeAccounts, applyTransactions and finalTest methods
        try {
            loadTradeAccounts();
            applyTransactions();
            finalTest();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    
    }

    /**
     * loadTradeAccounts() - read the accounts.txt file
     * @throws IOException 
     */
    public static void loadTradeAccounts() throws IOException {
        Files.lines(paths[0])
            .forEach(line -> {
                String[] words = line.split(" ");
                if (words[0].equals(CASH.toString())) {
                    cashAccountService.createTradeAccount(new CashAccount(words[1], new BigDecimal(words[2])));
                } else {
                    marginAccountService.createTradeAccount(new MarginAccount(words[1], new BigDecimal(words[2])));
                }
            });
    }

    /**
     * applyTransactions() - read the transactions.txt file
     */
    public static void applyTransactions() throws IOException{
        Files.lines(paths[1])
            .forEach(line -> {
                String[] words = line.split(" ");
                Boolean isChecking = words[0].equals(CASH.toString());
                TradeAccountService accountService = isChecking ? cashAccountService : marginAccountService;
                Transaction transaction = Transaction.valueOf(words[2]);
                if (transaction.equals(Transaction.DEPOSIT)) {
                    accountService.deposit(words[1], new BigDecimal(words[3]));
                } else {
                    accountService.withdraw(words[1], new BigDecimal(words[3]));
                }
        });
    }

    /**
     * finalTest() - print the cash balance of the CashAccount and MarginAccount objects
     * @throws IOException
     */
    public static void finalTest() throws IOException {
        System.out.println("Account A1234B Cash Balance: " + cashAccountService.retrieveTradeAccount("A1234B").getCashBalance());
        System.out.println("Account E3456F Cash Balance: " + cashAccountService.retrieveTradeAccount("E3456F").getCashBalance());
        System.out.println("Account I5678J Cash Balance: " + cashAccountService.retrieveTradeAccount("I5678J").getCashBalance());
        System.out.println("Account C2345D Margin: " + marginAccountService.retrieveTradeAccount("C2345D").getMargin());
        System.out.println("Account G4567H Margin: " + marginAccountService.retrieveTradeAccount("G4567H").getMargin());
    }
    

}