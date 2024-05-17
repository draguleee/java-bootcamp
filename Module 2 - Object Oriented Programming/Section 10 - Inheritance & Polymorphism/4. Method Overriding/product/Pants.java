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

    // Override the fold() method from the Product class
    // We replace the implementation of the one that was inherited
    @Override
    public void fold() {
        System.out.println("- Hold pants upright.");
        System.out.println("- Fold one leg over the other.");
        System.out.println("- Fol pants from bottom in thirds.");
    }

}
