import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MyCollections {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.get(0);
        a1.add("Test");

        for(String s : a1) {
            System.out.println(s);
        }

        a1.remove("Test");

        Set<String> uniqueColors = new HashSet<>();
        // Adding elements to the HashSet
        uniqueColors.add("Red");
        uniqueColors.add("Green");
        uniqueColors.add("Blue");
        uniqueColors.add("Red"); // Adding



    }
}
