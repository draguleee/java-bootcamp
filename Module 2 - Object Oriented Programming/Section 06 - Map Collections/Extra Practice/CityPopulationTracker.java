import java.util.HashMap;

/**
 * CityPopulationTracker class
 */

public class CityPopulationTracker {

    // Define a HashMap that stores key (String) - value (City) pairs
    private HashMap<String, City> cityPopulations;

    // Constructor that initializes the empty HashMap
    public CityPopulationTracker() {
        this.cityPopulations = new HashMap<String, City>();
    }

    // Getter for city
    public City getCity(String name) {
        return new City(this.cityPopulations.get(name));
    }

    // Setter for city
    public void setCity(City city) {
        this.cityPopulations.put(city.getName(), new City(city));
    }

    /**
     * addCity() - adds a City object to the HashMap with the corresponding city name
     */
    public void addCity(City city) {
        this.cityPopulations.put(city.getName(), new City(city));
    }
    
}
