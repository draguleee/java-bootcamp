import java.util.Arrays;

/**
 * Car class
 */

public class Car {
    
    // Instance variables (private, as they should be. :) )
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    // Constructor with parameters
    public Car(String make, double price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    // Copy Constructor
    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    // Getter & Setter for make
    public String getMake() { return this.make; }
    public void setMake(String make) { this.make = make; }

    // Getter & Setter for price
    public double getPrice() { return this.price; }
    public void setPrice(double price) { this.price = price; }

    // Getter & Setter for year
    public int getYear() { return this.year; }
    public void setYear(int year) { this.year = year; }

    // Getter & Setter for color
    public String getColor() { return this.color; }
    public void setColor(String color) { this.color = color; }

    // Getter & Setter for parts
    public String[] getParts() { return Arrays.copyOf(this.parts, this.parts.length); }
    public void setParts(String[] parts) { this.parts = Arrays.copyOf(parts, parts.length); }

    // Method to drive the car
    public void drive() {
        System.out.println("\nYou bought the beautiful " + this.year + " " + this.color + " " + this.make + " for " + this.price + "!");
        System.out.println("Please drive your car to the nearest exit.");
    }

    // toString() method - prints the object as a String
    @Override
    public String toString() {
        return "Make: " + this.make + ".\n" 
            +  "Price: " + this.price + ".\n"
            +  "Year: " + this.year + ".\n"
            +  "Color: " + this.color + ".\n"
            +  "Parts: " + Arrays.toString(parts) + ".\n";

    }

}
