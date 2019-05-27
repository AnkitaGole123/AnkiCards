package ankidroid;

import java.util.Objects;

public class Card {
    private String frontDescription;
    private String backDescription;

    @Override
    public String toString() {
        return frontDescription + ',' + backDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(frontDescription, card.frontDescription) &&
                Objects.equals(backDescription, card.backDescription);
    }

    public Card(String frontDescription, String backDescription) {
        this.frontDescription = frontDescription;
        this.backDescription = backDescription;
    }
}
