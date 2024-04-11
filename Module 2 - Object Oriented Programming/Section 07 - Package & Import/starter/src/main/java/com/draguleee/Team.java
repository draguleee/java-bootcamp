package src.main.java.com.draguleee;

import java.util.HashMap;
import java.util.Map;

public class Team {

    // Instance variables (private)
    private String name;
    private Map<String, String> players;

    // Constructor with parameters
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

    // Getter for players
    public String getPlayer(String position) {
        return this.players.get(position);
    }

    // Setter for players
    public void setPlayer(String position, String player) {
        this.players.put(position, player);
    }
    
}
