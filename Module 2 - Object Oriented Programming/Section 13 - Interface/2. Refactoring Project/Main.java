import java.math.BigDecimal;
import java.util.*;

import pojo.*;
import repository.AccountRepository;
import service.AccountService;
import service.CheckingService;
import service.CreditService;

/**
 * Main class
 */

public class Main {

    public static void main(String[] args) {

        // Initialize the repository
        AccountRepository repository = new AccountRepository();

        // Create 
        CheckingService checkingService = new CheckingService(repository);
        CreditService creditService = new CreditService(repository);
        
        // Assume these were obtained from user input
        List<Account> accounts = Arrays.asList(
            new Checking("A1234B", new BigDecimal("500.00")),
            new Checking("E3456F", new BigDecimal("300.50")),
            new Checking("I5678J", new BigDecimal("100.25")),
            new Credit("A1534B", new BigDecimal("0.50")),
            new Credit("G4567H", new BigDecimal("200.00"))
        );

        // Add the accounts to the AccountRepository object
        accounts.forEach(account -> {
            if (account instanceof Checking) {
                checkingService.createAccount((Checking) account);
            } else {
                creditService.createAccount((Credit) account);
            }
        });

        // CRUD
        Checking checking = (Checking) repository.retrieveAccount("A1234B");
        checking.setBalance(checking.getBalance().add(new BigDecimal("100")));
        repository.updateAccount(checking);
        repository.deleteAccount("G4567H");

        AccountService accountService = new CheckingService(repository);
        accountService.deposit("1", new BigDecimal("100"));
        accountService.withdraw("1", new BigDecimal("15"));

        System.out.println();

    }

}