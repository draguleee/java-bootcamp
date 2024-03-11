import java.util.Arrays;

/**
 * Dealership class
 */

public class Dealership {

    // Instance variable (private)
    private Car[] cars;

    // Constructor with parameter (deep copy)
    public Dealership(Car[] cars) {
        this.cars = new Car[cars.length];
        for (int i = 0; i < this.cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }
    }

    // Getter for car
    public Car getCar(int index) {
        return new Car(this.cars[index]);
    }

    // Setter for car
    public void setCar(int index, Car newCar) {
        this.cars[index] = new Car(newCar);
    }

    // Method to sell the car
    public void sell(int index) {
        this.cars[index].drive();
    } 

    // toString() - prints the object as a String
    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            String carDescription = this.cars[i].toString();
            temp += carDescription + "\n";
        }
        return temp;
    }
    
}
