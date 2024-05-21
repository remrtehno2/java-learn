import java.util.ArrayList;
import java.util.List;

public class ChallengeLambda {
    public static void main(String[] args) {
           /*
                    () -> {    }
                    (p1, p2, ...) -> {    return...  }
                    () -> 1 == () -> { return 1; }
          */
        List<String> vegetable = new ArrayList<>();
        vegetable.add("potato");
        vegetable.add("onion");
        vegetable.add("carrot");


//      vegetable.forEach(System.out::println);
        vegetable.forEach((vegetableItem) -> {
            System.out.println(vegetableItem);
        });


    }
}
