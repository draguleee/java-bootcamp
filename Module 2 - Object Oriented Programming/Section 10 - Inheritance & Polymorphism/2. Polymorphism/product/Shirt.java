package product;

/**
 * Shirt class
 */

public class Shirt extends Product {

    // Instance variables (private)
    private Size size;
    public enum Size {SMALL, MEDIUM, LARGE}

    // Getter for size
    public Size getSize() {
        return this.size;
    }

    // Setter for size
    public void setSize(Size size) {
        this.size = size;
    }

}
