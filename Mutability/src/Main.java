import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Base base = new Base();

        System.out.println(base.stringList);
//        base.stringList = new ArrayList<>();
        base.stringList.add("Test3");
        System.out.println(base.stringList);

        final var stringBuilder = new StringBuilder("Test1");
        stringBuilder.append("Test");
//         stringBuilder = new StringBuilder();

        final var stringText = "";
        var clearedText = stringText.trim();

//        stringText = "test";

//        base.getName() = null;
        // calculate(base)
        // print(base)
//        System.out.println(base.getName());


//         base.age = 1000;
        // calculate(base)
        // print(base)
//        System.out.println(base.age);


        Child child = new Child();

        System.out.println(child.age);
        System.out.println(child.getName());


        Base base2 = new Base();
        base2.siblings = 0;


//        System.out.println(child.siblings);


        List<String> list = new ArrayList<>(List.of("Test1", "Test2"));
        var classA = new Base();
        var classB = new OtherBaseClass2();

        classA.list = new ArrayList<>(list);
        classB.list = new ArrayList<>(list);

//        classA.clearList();

        System.out.println("Class A: " + classA.list);
        System.out.println("Class B: " + classB.list);

        System.out.println("-".repeat(90));

        classA.getList().clear();
        classA.getList().add("test");

        System.out.println("Class A: " + classA.getList());
        System.out.println("Class B: " + classB.getList());

    }
}