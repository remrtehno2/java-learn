import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionAlgorithms {
    public static void main(String[] args) {
        ArrayList<Integer> arrayOfInts = new ArrayList<>();

        arrayOfInts.add(10);
        arrayOfInts.add(100);
        arrayOfInts.add(1);

        System.out.println(arrayOfInts);

        Collections.sort(arrayOfInts);

        System.out.println(arrayOfInts);


        // ======================


        Card aceOfHearts = Card.getFaceCard(Card.Suit.DIAMOND, 'J', 11); // new Card();
        System.out.println(aceOfHearts);

        ArrayList<Card> cards = new ArrayList<>();
        cards.add(aceOfHearts);
        cards.add(new Card(Card.Suit.HEART, "K", 13));
        cards.add(new Card(Card.Suit.SPADE, "A", 10));

        cards.add(new Card(Card.Suit.HEART, "A", 11));
        cards.add(new Card(Card.Suit.HEART, "Q", 13));

        cards.add(new Card(Card.Suit.CLUB, "K", 10));
        cards.add(new Card(Card.Suit.SPADE, " ", 9));

        System.out.println(cards);

        Collections.shuffle(cards);

        System.out.println(cards);


        List<Card> copiesOfAcesOfHearts = Collections.nCopies(15, aceOfHearts);
        System.out.println(copiesOfAcesOfHearts);






    }
}
