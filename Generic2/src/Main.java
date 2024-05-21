import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        GenericClass<String, Integer> genericClass = new GenericClass<>("Text", 10);
        genericClass.getMethod("Text");

        genericClass.<Double>getMethod3(42.2);
        genericClass.<Double>getMethod4(42.2, "Test");

        System.out.println(genericClass.field1);

        int[] numbers = {1, 2, 3, 4, 5};

        int temp = 1;
        Integer temp2 = 23;

        GenericChallenge<Integer> genericChallenge = new GenericChallenge<>();
        genericChallenge.method1(50);
        genericChallenge.field = 5;
        genericChallenge.<Double>method2(2.5, 20);



    }
}
