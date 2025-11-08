import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ChallaengeReadingFiles {
    public static void main(String[] args) {
        var listA = List.of(1, 2, 3);
        var listB = List.of(1, 2, 3);

        List<Integer> t =  new ArrayList<>();
        t.addAll(listA);
        t.addAll(listB);

        System.out.println(t);



        LinkedList<Integer> n = new LinkedList<>();

        n.get(0);

        Path path = Path.of("readFileChallenge.txt");

        Pattern regexLine = Pattern.compile("[A-Za-z]+\\b");
        try {
            var content = Files.readAllLines(path);
            content.forEach(s -> {
                Matcher matcher = regexLine.matcher(s);
//                System.out.println("String: " + s);

                if (matcher.matches()) {
                    System.out.println("Matched: " + matcher);
                }

                while (matcher.find()) {
                    System.out.println("Find: " + matcher.group());
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            Map<Long, String> treeMap = new TreeMap<>();

            Scanner scanner = new Scanner(new File("readFileChallenge.txt"));
            scanner.findAll("[A-Za-z]{4,}\\b")
                    .map(MatchResult::group)
//                    .limit(10)
                    .collect(
                            Collectors.groupingBy(m -> m,
                                    Collectors.counting())
                    )
                    .forEach((k,v) -> {
                        treeMap.put(v, k);
                        //System.out.println(k  + ": " + v);
                    });

                treeMap.forEach((k,v) -> {
                    System.out.printf("[%s]: %d \n", v, k);
                });


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
