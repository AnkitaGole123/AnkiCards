package ankidroid;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    public final List<Card> cardList = new ArrayList<>();
    public String name;
    public Deck(String name) {
        this.name = name;
    }

    public List<Card> createDeck(String frontDescription, String backDescription){
        Card cards = new Card(frontDescription,backDescription);
        cardList.add(cards);
        return cardList;
    }
}
