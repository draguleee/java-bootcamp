import src.main.java.com.draguleee.Game;
import src.main.java.com.draguleee.Team;

public class Main {

    public static void main(String[] args) {
        
        // Create bulls Team object
        Team bulls = new Team("Chicago Bulls");
        bulls.setPlayer("SHOOTING_GUARD", "Michael Jordan");
        bulls.setPlayer("SMALL_FORWARD", "Scottie Pippen");
        bulls.setPlayer("POWER_FORWARD", "Dennis Rodman");
        bulls.setPlayer("CENTER", "Bill Wennington");
        bulls.setPlayer("POINT_GUARD", "Randy Brown");

        // Create pistons Team object
        Team pistons = new Team("Detroit Pistons");
        pistons.setPlayer("SHOOTING_GUARD", "Joe Dumars");
        pistons.setPlayer("SMALL_FORWARD", "Grant Hill");
        pistons.setPlayer("POWER_FORWARD", "Otis Thorpe");
        pistons.setPlayer("CENTER", "William Bedford");
        pistons.setPlayer("POINT_GUARD", "Isiah Thomas");

        Game game = new Game("Etihad Stadium");
        game.begin(bulls, pistons);
    }

}
