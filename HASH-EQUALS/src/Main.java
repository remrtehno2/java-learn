import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        List<Integer> intergerlist = new ArrayList<>(List.of(1,2,3));
//        System.out.println(intergerlist.indexOf(2));

        List<User> users = new ArrayList<>(
                List.of(
                        new User("Test 1"),
                        new User("Test 2"),
                        new User("Test 3"),
                        new User("Test 3"),
                        new User("Test 3")
                )
        );

        users.add(null);
        users.add(null);

        System.out.println(users);

        System.out.println(
                users.indexOf( new User("Test 4") )
        );

        System.out.println(
                users.lastIndexOf( new User("Test 3") )
        );

        System.out.println(
                Collections.frequency(users, new User("Test 3") )
        );

        var u1 = new User("Test");
        var u2 = new User("Test");

        System.out.println(u1 == u2);
//        "Test 2".equals("Test2");
    }
}
