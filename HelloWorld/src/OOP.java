class Admin {
    static String name = "Admin";
    static int pass = 132;

    public static void delBook() {

    }

    public static void addBook() {

    }

    public static void sortBook() {

    }
}

class VasyaAdmin {
    static String name = "VasyaAdmin";
    static int pass = 532;

    public static void delBook() {

    }

    public static void addBook() {

    }

    public static void sortBook() {

    }
}
class PetyaAdmin {
    static String name = "VasyaAdmin";
    static int pass = 532;

    public static void delBook() {

    }

    public static void addBook() {

    }

    public static void sortBook() {

    }
}

class BookLibrary {
    static String name1 = "Book1";
    static String name2 = "Book2";
    static String name4 = "Book3";
    static String name5 = "Book4";
}

public class OOP {
    public static void main(String[] args) {
        Admin.addBook();
        Admin.delBook();
        System.out.println(Admin.name);
        System.out.println(Admin.pass);

        System.out.println(VasyaAdmin.name);
        System.out.println(VasyaAdmin.pass);
        VasyaAdmin.addBook();
        VasyaAdmin.delBook();
        VasyaAdmin.sortBook();


        System.out.println(Integer.max(5, 10));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }
}
