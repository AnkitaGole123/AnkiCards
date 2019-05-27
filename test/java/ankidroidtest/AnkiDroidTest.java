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
        Deck remeber = new Deck("remeber");
        assertEquals("[what is object,instance of class]", remeber.createDeck("what is object","instance of class").toString());
    }
}

