import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        for (char ch : "BINGO".toCharArray()) {
//
//        }

        IntStream bStream = IntStream.iterate(1, n -> {
                    return n + 1;
                }).limit(15)
                .map(n -> 'B' + n);

        IntStream iStream = IntStream.range(16, 30)
                .map(n -> 'I' + n);


//        printStream(
//                IntStream.concat(bStream, iStream)
//        );


        printStream(
                Stream.iterate(1, n -> n <= 15, n -> n + 1)
                        .map(n -> "B" + n)
        );

        int[] IincrementNumber = {15};
        printStream(
                Stream.generate(() -> ++IincrementNumber[0])
                        .limit(15)
                        .map(n -> "I" + n)
        );


        int[] arrayForNword = new int[15];
        Arrays.setAll(arrayForNword, i -> i + IincrementNumber[0]++);
        printStream(
                Stream.of(arrayForNword)
                        .map(n -> "N" + n)
        );
    }

    static public <T extends Stream<?>> void printStream(T stream) {
        stream.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }

    static public <T extends IntStream> void printStream(T stream) {
        stream.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}