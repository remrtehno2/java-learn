import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(List.of(1,2,3));

        intList.forEach(num -> System.out.println(num));

        Consumer3<Integer> lmb = (var arg) -> {
            return 1;
        };

        Integer tr = lmb.accept(1);



        interface myNum {
            int func(int n);
        }

        int  num = 10;
        myNum myLablda = (n) -> {
            //   int v = num + n;

//            num++;


            return 1;
        };

        num = 9;


        /// java Predefined Interfaces Challenges
        Consumer<String> printTheParts = (String sentence) ->{
                String[] parts = sentence.split(" ");
                for(String part : parts) {
                    System.out.println(part);
                }
        };

        printTheParts.accept("Hi bro");

        UnaryOperator<String> everySecondChar = (source) -> {
            return "Test";
        };

        System.out.println(
            everySecondChar.apply("TEsts")
        );

        Predicate<String> p1 = s -> s.equals("Tim");
        p1.and("E0");
    }
}




@FunctionalInterface
interface Consumer3<T> {
    Integer accept(T t);

    default void accept2() {

    }
    static void accept123() {

    }
}