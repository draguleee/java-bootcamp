/**
 * City Class
 */

public class City {

    // Instance variables (private)
    private String name;
    private long population;

    // Constructor with parameters
    public City(String name, long population) {
        this.name = name;
        this.population = population;
    }

    // Copy constructor
    public City(City source) {
        this.name = source.name;
        this.population = source.population;
    }

    // Getters
    public String getName() { return this.name; }
    public long getPopulation() { return this.population; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setPopulation(long population) { this.population = population; }

}
