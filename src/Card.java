

public final class Card {
    private final Suit suit;
    private final Rank rank;

    // Example: Card.Suit.HEARTS
    public enum Suit {
        HEARTS,
        DIAMONDS,
        CLUBS,
        SPADES;
    }

    // Example: Card.Rank.ONE
    // Might be longer to type but the order defined by the enum seems very useful.
    public enum Rank {
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
        ACE
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Card) {
            return ((Card) object).getSuit() == this.suit && ((Card) object).getRank() == this.rank;
        }
        return false;
    }

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }
}