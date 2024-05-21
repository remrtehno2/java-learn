import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Card> listOfCards = Card.getStandardDeck();

        Card.printDeck(listOfCards);
    }
}
