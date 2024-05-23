/**
 * Item class
 */

public class Item {
    
    // Instance variables (private)
    private String name;
    private double price;

    // Constructor for Item class
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter for name
    public String getName() {
        return this.name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for price
    public double getPrice() {
        return this.price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

}
