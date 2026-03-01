/**
 * Repersents a Player in the game
 * This class tracks the score accumulated by this player during a game
 */
public class Player {
    private final String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    /**
     * Adds the specified points to the current score.
     * @param points to be added to the player's score
     */
    public void addScore(int points) {
        this.score += points;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}