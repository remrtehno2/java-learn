import java.util.ArrayList;
import java.util.List;

public class Base {
    private String name = "User1";
    public final int age;
    protected int siblings = 2;

    public final List<String> stringList = new ArrayList<>(List.of("Test", "Test2"));

    public List<String> list;

    public void clearList() {
        this.list.clear();
    }

    public List<String> getList() {
        return new ArrayList<>(list);
    }

    public Base() {
        this.age = 19;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
