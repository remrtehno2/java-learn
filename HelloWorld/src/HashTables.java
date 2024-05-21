import java.util.ArrayList;
import java.util.Objects;

public class HashTables {
    public static void main(String[] args) {
        String testText = "Test";

        System.out.println(testText.hashCode());
        Objects.hash();


        Challenge3game tempClass = new Challenge3game();

        tempClass.main();

        // put good hashes for optimizing
        Objects.hash(tempClass);

        // in hashmaps should have unique code
        System.out.println(new Challenge3game().hashCode());
        System.out.println(new Challenge3game().hashCode());
        System.out.println(Objects.hash("Test"));
        System.out.println(Objects.hash("Test"));
        System.out.println(Challenge3game.class);
        System.out.println(tempClass.getClass());

        //String

        "Y".equals("O");


        // HashSet<String>();

        ArrayList<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(1);


    }
}
