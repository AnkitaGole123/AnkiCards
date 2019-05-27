package ankidroid;
public class Card {
    private String frontDescription;
    private String backDescription;

    @Override
    public String toString() {
        return frontDescription + ',' + backDescription;
    }

    public Card(String frontDescription, String backDescription) {
        this.frontDescription = frontDescription;
        this.backDescription = backDescription;
    }
}
