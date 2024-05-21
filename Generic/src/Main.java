import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //bounded
        Layer layer = new Layer();

        // for arrays
        // Comparable<>;

        layer.addElements(
                new Park("Yellowstone National Park", "44.4882,-110.5916")
        );

        layer.renderLayer();




        //class Exercption
        Student tim = new Student ("Tim");
        Student [] students = {new Student("Zach"), new Student("Tim"),
                new Student("Ann")};

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("result = " + tim.compareTo("Mary"));

        //
        Set<Park> ttt = new HashSet();

        /* *********** */
        /* Generics Basics */
        GenericCLass<Integer, String> genericCLass = new GenericCLass<Integer, String>();

        genericCLass.field1 = 1;

        System.out.println(genericCLass.field1);



    }
}


class Student implements Comparable {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        Student other = (Student) o;
        return name.compareTo(other.name);
    }
}