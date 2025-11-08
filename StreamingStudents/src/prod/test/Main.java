package prod.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(getNullableText());

//        getNullableText().ifPresentOrElse();

        getNullableText().orElseGet(() -> {
            System.out.println("Supplier INT");
            return "";
        });

        var p = getNullableText().map(l -> "RT");

        System.out.println(p);



        // Stream
        Stream<String> stream = Stream.of("one", "two", "three", "four");
        Stream<String> peekedStream = stream.peek(System.out::println);

// IntStream
        IntStream intStream = IntStream.range(1, 5);
        IntStream peekedIntStream = intStream.peek(System.out::println);


        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        IntStream nameLengths = names.stream()
                .mapToInt(String::length);

        nameLengths.forEach(System.out::println);



        List<String> names2 = Arrays.asList("Alice", "Bob", "Charlie", "Alice", "David", "Bob");

        List<String> uniqueNames = names2.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueNames);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 1, 2, 3, 4);

        List<Integer> result = numbers.stream()
                .dropWhile(n -> n < 3)
                .collect(Collectors.toList());

        System.out.println(result);
    }

    public static Optional<String> getNullableText() {
        return Optional.ofNullable("test");
    }
}
