import java.util.HashMap;
import java.util.Map;

/**
 * Represents the game
 * This class tracks the players' scores and is responsible for the scoreboard
 */
public class Game {
    // Stores player names and their current scores
    private final Map<String, Player> players;

    public Game(Player p1, Player p2, Player p3, Player p4) {
        players = new HashMap<>();
        players.put(p1.getName(), p1);
        players.put(p2.getName(), p2);
        players.put(p3.getName(), p3);
        players.put(p4.getName(), p4);
    }

    public void startRound() {

    }

    /**
     * Constructs a multi-line string representing the scoreboard.
     * @return A string containing each player's name and score
     */
    public String getScoreboard() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- Current Standings ---\n");

        for (Map.Entry<String, Integer> entry : scoreboard.entrySet()) {
            sb.append(entry.getKey())
                    .append(": ")
                    .append(entry.getValue().getScore())
                    .append("\n");
        }

        return sb.toString();
    }
}