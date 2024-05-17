package product;

/**
 * Shirt class
 */

public class Shirt extends Product {

    // Instance variables (private)
    private Size size;
    public enum Size {SMALL, MEDIUM, LARGE}

    // Constructor for Shirt class
    public Shirt(double price, String color, String brand, Size size) {
        super(price, color, brand);
        this.size = size;
    }

    // Getter for size
    public Size getSize() {
        return this.size;
    }

    // Setter for size
    public void setSize(Size size) {
        this.size = size;
    }

    // Override the fold() method from the Product class
    // We replace the implementation of the one that was inherited
    @Override
    public void fold() {
        System.out.println("- Lay shirt on a flat surface.");
        System.out.println("- Fold the shirt sideways.");
        System.out.println("- Bring sleeves in.");
        System.out.println("- Fold from bottom up.");
    }

}
