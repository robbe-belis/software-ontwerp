import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Deck {
    private int PLAYER_COUNT = 4;
    private int DECK_COUNT = 52;
    // when cards are dealt each player first gets 4 then 4 more and finally 5
    private int[] dealSteps = {4, 4, 5};

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
    private void dealPlayerCards(String player, int cardsAmount) {
        for (int i = 0; i < cardsAmount; i++) {
            ArrayList<Card> cardList = this.playerCards.get(player);
            cardList.add(this.currentCards.getLast());
            this.currentCards.remove(this.currentCards.toArray().length - 1);
        }
    }

    // ======================= Public =======================

    // playerNames needs to be in order from left to right
    public Deck(ArrayList<String> playerNames) {
        this.playerCards = new HashMap<String, ArrayList<Card>>();
        for (String player : playerNames) {
            this.playerCards.put(player, new ArrayList<Card>());
        }
        this.currentCards = getDeckCards();
    }

    // returns temporary trump suit (last card dealt)
    public Card.Suit DealCards() {
        for (int cardsAmount : this.dealSteps) {
            for (String player : this.players) {
                dealPlayerCards(player, cardsAmount);
            }
        }
        Card lastCard = this.playerCards.get(this.players.getLast()).getLast();
        return lastCard.getSuit();
    }

    public ArrayList<Card> getCards(String playerName) {
        ArrayList<Card> playerCards = this.playerCards.get(playerName);
        // makes a shallow copy (should be okay if cards are immutable)
        return (ArrayList<Card>) playerCards.clone();
    }

    // add cards to the deck
    public void returnCards(ArrayList<Card> cards) {
        this.currentCards.addAll(cards);
    }
}