public class Functions {
    public static int calcPerimiter(int h, int w) {
        return h * w;
    }

    /*
    calcPerimiter(10, 20);
    calcPerimiter(10, 20);
    calcPerimiter(430, 30);
     */
    public static String greetings(String nameOfUser) {
        return "Hello " + nameOfUser;
    }

    public static String getName() {
        return "Zoda";
    }

    public static void startDisplay() {
        System.out.println("======= Email manager application ======");
    }

    public static void showHello() {
        String nameOfUser = getName();
        // String greetingsPeremennaya = greetings("Zoda");
        String greetingsPeremennaya = greetings(nameOfUser);

        System.out.println(greetingsPeremennaya);
    }

    public static void checkEmail() {
        System.out.println("You have 50 emails unreaded");
    }

    public static void main(String[] args) {
        // 1) start display
        // 2) show Hello
        // 3) Check email

        startDisplay();

        showHello();

        checkEmail();
    }
}
