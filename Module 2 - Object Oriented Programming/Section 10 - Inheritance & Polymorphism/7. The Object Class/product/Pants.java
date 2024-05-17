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
        super.fold();
        System.out.println("- Hold pants upright.");
        System.out.println("- Fold one leg over the other.");
        System.out.println("- Fold pants from bottom in thirds.");
    }

    // Override the wear() method from the Product class
    // We replace the implementation of the one that was inherited
    @Override
    public void wear() {
        System.out.println("The " + this.waist + " " + this.length + " pants look great on you!");
    }

    /**
     * toString() - prints the Pants object as a String
     */
    public String toString() {
        return "Pants: " + this.waist + " " + this.length + " " + super.getBrand() + " " + super.getColor() + " " + super.getPrice();
    }

}
