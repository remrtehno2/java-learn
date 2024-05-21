public class Main {
    public static void main(String[] args) {
        printHi("Igor", 27);
        printHi("Feya", 30);
        printHi("Sasha", 55);
        printHi("Petya", 30);

        
    }

    private static void printHi(String nameArg, int agesArg, int test) {
        System.out.println("Hi " + nameArg + " Age: " + agesArg);
    }
}
