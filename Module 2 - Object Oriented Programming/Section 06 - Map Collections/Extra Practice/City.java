/**
 * City class
 */

public class City {
    
    // Instance variables (private)
    private String name;
    private String country;
    private long population;

    // Constructor that initializes the fields of a newly created object by calling the setter methods
    public City(String name, String country, long population) {
        setName(name);
        setCountry(country);
        setPopulation(population);
    }

    // Copy constructor
    public City(City source) {
        setName(source.name);
        setCountry(source.country);
        setPopulation(source.population);
    }

    // Getter for name field
    public String getName() {
        return this.name;
    }

    // Setter for name field
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank!");
        } else {
            this.name = name;
        }
    }

    // Getter for country field
    public String getCountry() {
        return this.country;
    }

    // Setter for country field
    public void setCountry(String country) {
        if (country == null || country.isBlank()) {
            throw new IllegalArgumentException("Country cannot be null or blank!");
        } else {
            this.country = country;
        }
    }

    // Getter for population field
    public long getPopulation() {
        return this.population;
    }

    // Setter for population field
    public void setPopulation(long population) {
        if (population <= 0) {
            throw new IllegalArgumentException("Population must be greater than 0!");
        } else {
            this.population = population;
        }
    }
}
