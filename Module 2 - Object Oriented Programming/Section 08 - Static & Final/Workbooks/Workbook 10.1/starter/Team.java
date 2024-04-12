import java.util.HashMap;
import java.util.Map;

/**
 * Team class
 */

public class Team {

    // Instance variables (private)
    private String name;
    private Map<String, String> players;

    // Constructor for Team class with parameters
    public Team(String name) {
        this.name = name;
        this.players = new HashMap<>();
    }
    
    // Getter for name
    public String getName() {
        return this.name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for a specific player from the players HashMap
    public String getPlayer(String position) {
        return this.players.get(position);
    }

    // Setter for a player in the players HashMap
    public void setPlayer(String position, String player) {
        this.players.put(position, player);
    }
    
}
