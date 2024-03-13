import java.util.ArrayList;

/**
 * Main Class
 */

public class Main {
    public static void main(String[] args) {

        // Create City objects
        City paris = new City("Paris", 2161000);
        // City copy = paris;       // Dangerous!
        City copy = new City(paris);


        /********** EQUALS METHOD **********/

        // Returns true (it compares the REFERENCES, not the CONTENT)
        System.out.println(paris.equals(copy));
        
        // Set the population for the two cities
        copy.setPopulation(2059003);
        paris.setPopulation(3129003);


        /********** CONTAINS METHOD **********/

        // Create an ArrayList of City objects
        ArrayList<City> cities = new ArrayList<>();

        // Add City objects to the cities ArrayList
        cities.add(new City("Paris", 2161000));
        cities.add(new City("Florence", 382258));
        cities.add(new City("Venice", 261905));
        cities.add(new City("Versailles", 85771));
        cities.add(new City("London", 8982000));
        
        System.out.println(cities.contains(paris));
    }

}