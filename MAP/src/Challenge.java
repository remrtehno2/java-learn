import java.util.HashMap;
import java.util.Map;

public class Challenge {
    public static void main(String[] args) {
        Map<Character, Integer> charsMap = new HashMap<>();

        String str = "Hello world!";
        // l = 3
        // o = 2
        // H = 1
        // e = 1
        // ......

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            charsMap.merge(ch, 1, (old, newV) -> old + newV);
        }
        System.out.println(charsMap);
    }
}
