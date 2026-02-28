import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Deck {
    private int PLAYER_COUNT = 4;
    private int DECK_COUNT = 52;

    private ArrayList<Card> currentCards;
    private ArrayList<String> players;
    private Map<String, ArrayList<Card>> playerCards;

    private ArrayList<Card> getDeckCards() {
        ArrayList<Card> cards = new ArrayList<Card>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
        return cards;
    }

    // playerNames needs to be in order from left to right
    public Deck(ArrayList<String> playerNames) {
        this.playerCards = new HashMap<String, ArrayList<Card>>();
        for (String player : playerNames) {
            this.playerCards.put(player, new ArrayList<Card>());
        }
        this.currentCards = getDeckCards();
    }

    // returns temporary trump suit (last card dealt)
    public Card.Suit DealCards() {}

    public ArrayList<Card> getCards(String playerName) {}

    // add cards to the deck
    public void returnCards(ArrayList<Card> cards) {}
}