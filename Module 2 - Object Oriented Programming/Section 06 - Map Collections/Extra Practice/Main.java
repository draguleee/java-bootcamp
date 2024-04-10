import java.util.Scanner;

/**
 * Main class
 */

public class Main {
    public static void main(String[] args) {

        // Create a Scanner
        Scanner scan = new Scanner(System.in);


        /************************* PART 1 *************************/
        
        // Create a City object and print its name
        City city1 = new City("New York", "USA", 8500000);
        System.out.println("\nCity information: ");
        System.out.println(city1.getName());
        System.out.println(city1.getCountry());
        System.out.println(city1.getPopulation());
    
        // Test invalid input for setName method
        System.out.print("\nNew name: ");
        String name = scan.nextLine();
        if (name == null || name.isBlank()) {
            System.out.println("Please insert a valid city name!");
        } else {
            city1.setName(name);
        }
    
        // Test invalid input for setCountry method
        System.out.print("New country: ");
        String country = scan.nextLine();
        if (country == null || country.isBlank()) {
            System.out.println("Please insert a valid country name!");
        } else {
            city1.setCountry(country);
        }
        
        // Test invalid input for setPopulation method
        System.out.print("New population: ");
        long population = scan.nextLong();
        if (population < 0) {
            System.out.println("Population must be greater than 0!");
        } else {
            city1.setPopulation(population);
        }

        // Print the modified object
        System.out.println("\nModified object: ");
        System.out.println("\tName: " + city1.getName());
        System.out.println("\tCountry: " + city1.getCountry());
        System.out.println("\tPopulation: " + city1.getPopulation() + "\n");
    
        // Test invalid input for the constructor
        // City city2 = new City("", "USA", 8500000);


        /************************* PART 2 *************************/

        // Add a CityPopultionTracker object
        CityPopulationTracker tracker = new CityPopulationTracker();

        // Test the addCity method
        tracker.addCity(new City("New York", "USA", 8550405));
        tracker.addCity(new City("Los Angeles", "USA", 3971883));

        // Test the getCity method
        City nyCity = tracker.getCity("New York");
        System.out.println("Population of New York: " + nyCity.getPopulation());

        // Test the setCity method
        City updatedNyCity = new City("New York", "USA", 8600000);
        tracker.setCity(updatedNyCity);

        // Verify that the city data was updated
        nyCity = tracker.getCity("New York");
        System.out.println("Updated population of New York: " + nyCity.getPopulation());


        /************************* PART 3 *************************/

        // Prompt for city name, country name and population
        scan.nextLine();
        String cityName = promptForCityName(scan);
        String countryName = promptForCountry(scan);
        int numberPopulation = promptForPopulation(scan);

        // Create a City object based on the inputs stored in the values above
        City newCity = new City(cityName, countryName, numberPopulation);

        // Add the previously created City object to the CityPopulationTracker object
        CityPopulationTracker newTracker = new CityPopulationTracker();
        newTracker.addCity(newCity);

        // Print the city added to the tracker
        System.out.println("City added to the tracker: " + newCity.getName());

    }



    /**
     * isNullOrBlank() - returns true if the input is null or blank; false otherwise.
     */
    public static boolean isNullOrBlank(String input) {
        return (input == null || input.isBlank()) ? true : false;
    }

    /**
     * incorrectPopulation() - returns true if the population is less than or equal to 0
     * @param population
     * @return
     */
    public static boolean incorrectPopulation(int population) {
        return (population <= 0) ? true : false;
    }

    /**
     * promptForCityName() - prompts the user to enter a valid city name
     * @param scan
     * @return
     */
    public static String promptForCityName(Scanner scan) {
        while(true) {
            System.out.print("\nPlease enter a valid city name: ");
            String cityName = scan.nextLine();
            if (!isNullOrBlank(cityName)) {
                return cityName;
            }
        }
    }

    /**
     * promptForCountry() - prompts the user to enter a valid country name
     * @param scan
     * @return
     */
    public static String promptForCountry(Scanner scan) {
        while(true) {
            System.out.print("\nPlease enter a valid country: ");
            String countryName = scan.nextLine();
            if (!isNullOrBlank(countryName)) {
                return countryName;
            }
        }    
    }

    /**
     * promptForPopulation() - prompts the user to enter a valid population
     * @param scan
     * @return
     */
    public static int promptForPopulation(Scanner scan) {
        while(true) {
            System.out.print("\nPlease enter a valid population: ");
            if (!scan.hasNextInt()) {
                scan.next();
                continue;
            }
            int population = scan.nextInt();
            if (!incorrectPopulation(population)) {
                return population;
            }
        }
    }
}