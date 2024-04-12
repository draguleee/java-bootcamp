import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Game class
 */

public class Game {

    // Instance variables (private)
    private String arena;
    private LocalDate date;

    // Constructor with parameters
    public Game(String arena) {
        this.arena = arena;
        date = LocalDate.now();
    }

    /**
     * begin() - starts the game
     * @param home
     * @param away
     */
    public void begin(Team home, Team away) {
        String formattedDate = this.date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        /*
         * date.getDayOfMonth() - picks up the day
         * date.getMonthValue() - picks up the month
         * date.getYear() - picks up the year
         */
        System.out.println
        (
        "\n - This matchup takes place at the " + this.arena + " arena on " + formattedDate + "." + 
        "\n - Tonight's game is between the " + home.getName() + " and the " + away.getName() + ".\n" +
        "\n - The starting lineup for the home team is: at point guard, " + home.getPlayer("POINT_GUARD") + "; at shooting guard, " + home.getPlayer("SHOOTING_GUARD") + "; at small forward, " + home.getPlayer("SMALL_FORWARD") + "; at power forward, " + home.getPlayer("POWER_FORWARD") + "; and at center, " + home.getPlayer("CENTER") + ".\n" +
        "\n - The starting lineup for the away team is: at point guard, " + away.getPlayer("POINT_GUARD") + "; at shooting guard, " + away.getPlayer("SHOOTING_GUARD") + "; at small forward, " + away.getPlayer("SMALL_FORWARD") + "; at power forward, " + away.getPlayer("POWER_FORWARD") + "; and at center, " + away.getPlayer("CENTER") +".\n" +
        "\n - Let's give a warm round of applause for both teams as they take the court!"
        );
    }

}

    




