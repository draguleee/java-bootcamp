package model;

import java.util.ArrayList;

/**
 * CarDealership class
 */

public class CarDealership {

    // Instance variables (private)
    private ArrayList<Car> cars;

    // Constructor for CarDealership class
    public CarDealership() {
        this.cars = new ArrayList<Car>();
    }

    // Getter for car
    public Car getCar(int index) {
        return new Car(this.cars.get(index));
    }

    // Setter for car
    public void setCar(Car car, int index) {
        this.cars.set(index, new Car(car));
    }

    /**
     * addCar() - adds a car to the cars array.
     * @param car
     */
    public void addCar(Car car) {
        this.cars.add(new Car(car));
    }
}