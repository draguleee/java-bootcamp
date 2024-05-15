import java.util.HashMap;
import java.util.Map;

import constants.Position;

/**
 * Team class
 */

public class Team {

    // Instance variables (private)
    private String name;
    private Map<Position, String> players;

    // Constructor for Tea class
    public Team(String name) {
        this.name = name;
        this.players = new HashMap<>();
    }
    
    // Getter for team's name
    public String getName() {
        return this.name;
    }

    // Setter for team's name
    public void setName(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Name cannot be null / blank!");
        this.name = name;
    }

    // Getter for team's player
    public String getPlayer(Position position) {
        return this.players.get(position);
    }

    // Setter for team's player
    public void setPlayer(Position position, String player) {
        if (position == null) {
            throw new IllegalArgumentException("Position cannot be null!");
        }
        this.players.put(position, player);
    }
    
}
