package ankidroidtest;

import ankidroid.Card;
import ankidroid.Deck;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnkiDroidTest {
    @Test public void itShouldReturnDeckName(){
        Deck addDeck=new Deck("remember");
        String expected="remember";
        assertEquals(expected,addDeck.name);
    }

    @Test public void itShouldAddCardsInDeckInList() throws IOException {
        Deck remember = new Deck("remember");
        remember.addCard("what is object", "instance of class");
        List<Card> expectedCard = new ArrayList<>();
        Card cards = new Card("what is object","instance of class");
        expectedCard.add(cards);
        assertEquals(expectedCard,remember.getCards());
    }
}

