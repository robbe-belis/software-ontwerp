import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @Test
    @DisplayName("Deck tests")
    void dealCards() {
        ArrayList<String> players = new ArrayList<>(Arrays.asList("Jan", "Piet", "Joris", "Corneel"));
        Deck deck = new Deck(players);
        deck.dealCards();
        ArrayList<Card> cardsJan = deck.getCards("Jan");
        ArrayList<Card> cardsPiet = deck.getCards("Piet");
        ArrayList<Card> cardsJoris = deck.getCards("Joris");
        ArrayList<Card> cardsCorneel = deck.getCards("Corneel");

        assertEquals(13, cardsJan.toArray().length);
        assertEquals(13, cardsPiet.toArray().length);
        assertEquals(13, cardsJoris.toArray().length);
        assertEquals(13, cardsCorneel.toArray().length);

        deck.returnCards(cardsJan);
        deck.returnCards(cardsPiet);
        deck.returnCards(cardsJoris);
        deck.returnCards(cardsCorneel);

        deck.dealCards();
        ArrayList<Card> cardsJan2 = deck.getCards("Jan");
        ArrayList<Card> cardsPiet2 = deck.getCards("Piet");
        ArrayList<Card> cardsJoris2 = deck.getCards("Joris");
        ArrayList<Card> cardsCorneel2 = deck.getCards("Corneel");

        // chances of players having the same card
        assertNotEquals(cardsJan, cardsJan2);
        assertNotEquals(cardsPiet, cardsPiet2);
        assertNotEquals(cardsJoris, cardsJoris2);
        assertNotEquals(cardsCorneel, cardsCorneel2);

        /*
        System.out.println(cardsJan);
        System.out.println(cardsPiet);
        System.out.println(cardsJoris);
        System.out.println(cardsCorneel);
         */
    }

}