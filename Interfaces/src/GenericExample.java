public class GenericExample {

    // Generic method that takes any type T and prints it
    public static <R> void printValue(R value) {
        System.out.println("Value is: " + value);
    }

    public static void main(String[] args) {
        // Call the generic method with different types
        printValue(123);         // Integer
        printValue("Hello");     // String
        printValue(3.14);        // Double
    }
}