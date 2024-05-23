import java.time.LocalDate;

/**
 * Payment class
 */

public class Payment {

    // Instance variables (private)
    private LocalDate date;
    private double amount;
  
    // Constructor for Payment class
    public Payment(LocalDate date, double amount) {
        this.date = date;
        this.amount = amount;
    }
  
    // Getter for date
    public LocalDate getDate() {
        return date;
    }
  
    // Getter for amount
    public double getAmount() {
        return amount;
    }
    
}
  
