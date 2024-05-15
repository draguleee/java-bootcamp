import model.Car;
import model.CarDealership;

import static constants.BodyType.*;
import static constants.Price.MAX_PRICE;
import static constants.Price.MIN_PRICE;
import static constants.ProductionYear.MIN_YEAR;

import java.util.Scanner;

import constants.BodyType;

/**
 * Main class
 */

public class Main {
    public static void main(String[] args) {


        /***************** PART 1 *****************/

        // Create a Car object
        // Car car1 = new Car("Toyota", "Camry", SEDAN, 2020, 30000);
        
        // Get all the Car object's details before performing changes (with the correspondin getters)
        // System.out.println(car1.getMake());
        // System.out.println(car1.getModel());
        // System.out.println(car1.getBodyType());
        // System.out.println(car1.getProductionYear());
        // System.out.println(car1.getPrice());

        // // Print the object with the toString method
        // System.out.println("\n" + car1.toString());

        // Invalid input for make 
        // car1.setMake("");

        // Invalid input for model
        // car1.setModel("");

        // Invalid input for body type
        // car1.setBodyType(null);

        // Invalid input for production year
        // car1.setProductionYear(1899);

        // Invalid input for price
        // car1.setPrice(-1);
        // car1.setPrice(200001);

        // Inalid input for constructor
        // Car car2 = new Car("", "Camry", SEDAN, 2020, 30000);


        /***************** PART 2 *****************/

        // Create some car objects
        // Car car1 = new Car("Toyota", "Camry", BodyType.SEDAN, 2020, 30000);
        // Car car2 = new Car("Honda", "Civic", BodyType.SEDAN, 2021, 25000);

        // Create the Car dealership
        // CarDealership dealership = new CarDealership();
        
        // Add the cars to the dealership object
        // dealership.addCar(car1);
        // dealership.addCar(car2);

        // Test the getCar method
        // Car retrievedCar = dealership.getCar(0);
        // System.out.println(retrievedCar.getMake() + " " + retrievedCar.getModel());

        // Test the setCar method
        // Car newCar = new Car("Ford", "Mustang", BodyType.COUPE, 2022, 45000);
        // dealership.setCar(newCar, 0);

        // Verify that the car was updated
        // retrievedCar = dealership.getCar(0);
        // System.out.println(retrievedCar.getMake() + " " + retrievedCar.getModel());


        /***************** PART 3 *****************/

        // Create the Scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter values for make, model, body type, year and price
        String make = promptForMake(scanner);
        String model = promptForModel(scanner);
        BodyType bodyType = promptForBodyType(scanner);
        int year = promptForYear(scanner);
        double price = promptForPrice(scanner);

        // Create a Car object using the values picked above
        Car newCar = new Car(make, model, bodyType, year, price);

        // Create a CarDealership object and add the Car object to it
        CarDealership dealership = new CarDealership();
        dealership.addCar(newCar);

        // Print the car's make and model
        System.out.println("Car added to the dealership: " + newCar.getMake() + " " + newCar.getModel());

    }

    /**
     * isNullOrBlank() - returns true if the input is null or blank
     * @param input
     * @return
     */
    public static boolean isNullOrBlank(String input) {
        return input == null || input.isBlank();
    }

    /**
     * invalidYear() - returns true if the input is less than the minimum production year
     * @param year
     * @return
     */
    public static boolean invalidYear(int year) {
        return year < MIN_YEAR;
    }

    /**
     * invalidPrice() - returns true if the input is less than the minimum price or greater than the maximum price
     * @param price
     * @return
     */
    public static boolean invalidPrice(double price) {
        return price < MIN_PRICE || price > MAX_PRICE;
    }

    /**
     * invalidBodyType() - returns true if the input does not match one of the body types in the enum
     * @param bodyType
     * @return
     */
    public static boolean invalidBodyType(String bodyType) {
        String capitalizedBodyType = bodyType.toUpperCase();
        try {
            BodyType.valueOf(capitalizedBodyType);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    /**
     * promptForMake() - retuns a valid make entered by the user
     * @param scanner
     * @return
     */
    public static String promptForMake(Scanner scanner) {
        while(true) {
            System.out.print("\nPlease enter a valid car make: ");
            String make = scanner.nextLine();
            if(!isNullOrBlank(make)) {
                return make;
            }
        }
    }

    /**
     * promptForModel() - returns a valid model entered by the user
     * @param scanner
     * @return
     */
    public static String promptForModel(Scanner scanner) {
        while(true) {
            System.out.print("\nPlease enter a valid car model: ");
            String model = scanner.nextLine();
            if(!isNullOrBlank(model)) {
                return model;
            }
        }
    }

    /**
     * promptForBodyType() - returns a valid body type entered by the user
     * @param scanner
     * @return
     */
    public static BodyType promptForBodyType(Scanner scanner) {
        while(true) {
            System.out.print("\nPlease enter a valid car body type: ");
            String bodyType = scanner.nextLine();
            if (!invalidBodyType(bodyType)) {
                return BodyType.valueOf(bodyType.toUpperCase());
            }
        }
    }

    /**
     * promptForYear() - returns a valid production year entered by the user
     * @param scanner
     * @return
     */
    public static int promptForYear(Scanner scanner) {
        while(true) {
            System.out.print("\nPlease enter a valid production year: ");
            if (!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }
            int productionYear = scanner.nextInt();
            if(!invalidYear(productionYear)) {
                return productionYear;
            }
        }
    }

    /**
     * promptForPrice() - returns a valid price entered by the user
     * @param scanner
     * @return
     */
    public static double promptForPrice(Scanner scanner) {
        while(true) {
            System.out.print("\nPlease enter a valid price: ");
            if (!scanner.hasNextDouble()) {
                scanner.next();
                continue;
            }
            double price = scanner.nextDouble();
            if(!invalidPrice(price)) {
                return price;
            }
        }
    }

}