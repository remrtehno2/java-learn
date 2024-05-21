class TestGen<T> {
    public void testMethod() {
        System.out.println("Yakki");
    }

    public class NestedClass implements Comparable<String> {
        public void main() {

        }

        @Override
        public int compareTo(String o) {
            return 0;
        }
    }
}
class TestGenInhireted<T> extends TestGen<T> {
    @Override
    public void testMethod() {
        System.out.println("Yakki 2");
    }

    public <V extends Number> void GenMethod(V arg) {

    }

//    public <U extends Number> U Retn(U v) {
//        class TR extends Number {
//
//            @Override
//            public int intValue() {
//                return 0;
//            }
//
//            @Override
//            public long longValue() {
//                return 0;
//            }
//
//            @Override
//            public float floatValue() {
//                return 0;
//            }
//
//            @Override
//            public double doubleValue() {
//                return 0;
//            }
//        }
//        return new TR();
//    }
}

public class GenericTightMoment {


    public static void main(String[] args) {
        TestGen<String> Test = new TestGen<>();
        TestGen<Integer>  Test2 = new TestGen<>();
        TestGenInhireted<Double>  Test3 = new TestGenInhireted<>();
        TestGenInhireted<Park>  Test4 = new TestGenInhireted<>();

        printSomething(Test);  // ? extends String
        printSomething(Test2); // ? extends Number
        printSomething(Test3); // ? extends Object - Hack
        printSomething(Test4); // ? extends Mappable


         Test4.<Double>GenMethod(0.0);

     // nested class init   Test.new NestedClass();
    }

    public static void printSomething(TestGen<?> tOb) {
        tOb.testMethod();
    }
}


