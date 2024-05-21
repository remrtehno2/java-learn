import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayChallenge2 {
    public static void main(String[] args) {
        ArrayList<Integer> banknotes = new ArrayList<>(10);

        banknotes.add(20);
        banknotes.add(30);
        banknotes.add(40);
        banknotes.add(50);

        System.out.println(banknotes);
        Collections.shuffle(banknotes);
        System.out.println(banknotes);
        Collections.sort(banknotes);
        System.out.println(banknotes);

        List<Integer> copiesOfBanknotes = Collections.nCopies(5,50);
        System.out.println(copiesOfBanknotes);

    }
}
