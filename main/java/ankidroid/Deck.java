package ankidroid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Deck {
    public final List<Card> cardList = new ArrayList<>();
    public String name;
    public Deck(String name) {
        this.name = name;
    }
    public void addCard(String frontDescription, String backDescription){
        Card card = new Card(frontDescription,backDescription);
        cardList.add(card);

    }
    public List<Card>getCards(){
        return cardList;
    }
}
