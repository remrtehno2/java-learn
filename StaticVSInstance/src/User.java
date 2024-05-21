public class User {
    public String name;
    public static int id = 0;
    public User(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }

    public static void printId() {
        System.out.println(id);
    }
}
