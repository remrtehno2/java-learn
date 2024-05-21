import java.util.Comparator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        NavigableSet<Integer> integerNavigableSet = new TreeSet<>(List.of(3,2,104,100, 5, 3));
//        integerNavigableSet.add(99);
//        integerNavigableSet.add(1);
//        integerNavigableSet.add(50);
//        integerNavigableSet.add(33);
//        integerNavigableSet.add(22);
//        integerNavigableSet.add(5);
//        integerNavigableSet.add(506);

        System.out.println("ceiling:" + integerNavigableSet.ceiling(3));
        System.out.println("ceiling:" + integerNavigableSet.higher(3));

        System.out.println("floor:" + integerNavigableSet.floor(100));
        System.out.println("lower:" + integerNavigableSet.lower(100));

        System.out.println("ceiling:" + integerNavigableSet.ceiling(104));
        System.out.println("higher:" + integerNavigableSet.higher(104));

        System.out.println("floor:" + integerNavigableSet.floor(2));
        System.out.println("lower:" + integerNavigableSet.lower(2));

        System.out.println("floor:" + integerNavigableSet.floor(1000));


        System.out.println("tailSet:" + integerNavigableSet.tailSet(5));
        System.out.println("headSet:" + integerNavigableSet.headSet(5));
        System.out.println("subSet:" + integerNavigableSet.subSet(3, 104));

        System.out.println(integerNavigableSet);


        System.out.println("-".repeat(90));

//        NavigableSet<User> userNavigableSet = new TreeSet<>(List.of(
//                new User("Marzik", 10), new User("Sasha", 1)
//        ));
        Comparator<User> mySort = Comparator.comparing(User::name).thenComparing(User::id);
        NavigableSet<User> userNavigableSet = new TreeSet<>(mySort);
        userNavigableSet.add(new User("Marzik", 10));
        userNavigableSet.add(new User("Sasha", 1));
        System.out.println(userNavigableSet);
    }
}
