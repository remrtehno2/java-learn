import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s2 = getStr();
        System.out.println(s2);

        List<User> userList = new ArrayList<>();

        User u1 = new User("User 1");
        User u2 = new User("User 2");

        userList.add(u1);
        userList.add(u2);

        userList.add(new User("User 3"));
    }

    public static String getStr() {
//        String s = "Hi";
//
//        return s;

        return "Hi";
    }


}