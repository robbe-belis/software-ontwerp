import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CardTest {

    @Test
    @DisplayName("Constructor tests")
    void constructorTests() {
        assertEquals(new Card(Card.Suit.CLUBS, Card.Rank.ACE), new Card(Card.Suit.CLUBS, Card.Rank.ACE));

        assertNotEquals(new Card(Card.Suit.DIAMONDS, Card.Rank.TWO), new Card(Card.Suit.SPADES, Card.Rank.TWO));
        assertNotEquals(new Card(Card.Suit.DIAMONDS, Card.Rank.THREE), new Card(Card.Suit.DIAMONDS, Card.Rank.FOUR));
    }

    @Test
    @DisplayName("Basic tests for the enums")
    void enumTests() {
        assertNotEquals(Card.Suit.HEARTS, Card.Suit.CLUBS);

        assertTrue(Card.Rank.ONE.ordinal() < Card.Rank.TEN.ordinal());
        assertTrue(Card.Rank.TEN.ordinal() < Card.Rank.JACK.ordinal());
        assertTrue(Card.Rank.JACK.ordinal() < Card.Rank.ACE.ordinal());
    }

    @Test
    @DisplayName("Getter tests")
    void getterTests() {
        Card card1 = new Card(Card.Suit.CLUBS, Card.Rank.FIVE);
        Card card2 = new Card(Card.Suit.CLUBS, Card.Rank.SIX);
        Card card3 = new Card(Card.Suit.DIAMONDS, Card.Rank.FIVE);

        assertEquals(Card.Suit.CLUBS, card1.getSuit());
        assertEquals(Card.Rank.FIVE, card1.getRank());

        assertEquals(card1.getSuit(), card2.getSuit());
        assertEquals(card1.getRank(), card3.getRank());

        assertNotEquals(card1.getRank(), card2.getRank());
        assertNotEquals(card2.getSuit(), card3.getSuit());
    }
}