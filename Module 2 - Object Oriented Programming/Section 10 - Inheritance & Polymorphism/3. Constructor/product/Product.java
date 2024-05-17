package product;

/**
 * Product class
 */

public class Product {
    
    // Instance variables (private)
    private double price;
    private String color;
    private String brand;

    // Constructor for Product class
    public Product(double price, String color, String brand) {
        this.price = price;
        this.color = color;
        this.brand = brand;
    }


    // Getter for price
    public double getPrice() {
        return this.price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for color
    public String getColor() {
        return this.color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for brand
    public String getBrand() {
        return this.brand;
    }

    // Setter for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * fold() - simple method that prints the object's brand and object's class
     */
    public void fold() {
        System.out.println("\nFolding my " + this.getBrand() + " " + this.getClass().getSimpleName());
    }

}
