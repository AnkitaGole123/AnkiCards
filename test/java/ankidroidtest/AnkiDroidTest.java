package ankidroidtest;

import ankidroid.Card;
import ankidroid.Deck;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnkiDroidTest {
    @Test public void itShouldReturnDeckName(){
        Deck addDeck=new Deck("remember");
        String expected="remember";
        assertEquals(expected,addDeck.name);
    }

    @Test public void itShouldAddCardsInDeck(){
        Deck remeber = new Deck("remember");
        assertEquals("[what is object,instance of class]", remeber.createDeck("what is object","instance of class").toString());
    }

    @Test public void itShouldAddCardsInDeckInList(){
        Deck remember = new Deck("remember");
        List<Card> expectedCard = new ArrayList<>();
        Card cards = new Card("what is object","instance of class");
        expectedCard.add(cards);
        assertEquals(expectedCard,remember.createDeck("what is object", "instance of class"));
    }
}

