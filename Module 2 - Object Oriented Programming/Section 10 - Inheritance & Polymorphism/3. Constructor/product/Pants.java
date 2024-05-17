package product;

/**
 * Pants class
 */

public class Pants extends Product {

    // Instance variables (private)
    private int waist;
    private int length;

    // Constructor for Pants class
    public Pants(double price, String color, String brand, int waist, int length) {
        super(price, color, brand);
        this.waist = waist;
        this.length = length;
    }


    // Getter for waist
    public int getWaist() {
        return this.waist;
    }

    // Setter for waist
    public void setWaist(int waist) {
        this.waist = waist;
    }

    // Getter for length
    public int getLength() {
        return this.length;
    }

    // Setter for length
    public void setLength(int length) {
        this.length = length;
    }

}
