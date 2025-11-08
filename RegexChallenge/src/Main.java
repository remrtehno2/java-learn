import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        var now = LocalDateTime.now();
        String rfcFormat = now.format(DateTimeFormatter.ofPattern("0) E, dd MMM yyyy -> 1) hh-mm--ss", Locale.CHINA));
        System.out.println(rfcFormat);


        String french = now.format(DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.FRANCE)); // 28 janv. 2018



        System.out.println("Hello %s 123 world!".replaceFirst("[0-9]*", "---"));

        System.out.println("Hello %s 123 world!".replaceAll("[ ]*", "_"));
        System.out.println("Hello %s 123 world!".replaceAll("[ ]+", "_"));
        System.out.println("Hello %s 123 world!".replaceFirst("[ ]*", "_"));
        System.out.println("Hello %s 123 world!".replaceFirst(".", "_"));
        System.out.println("Hello %s 123 world!".replaceFirst(".*", "_"));
        System.out.println("Hello %s 123 world!".replaceAll(".", "_"));
        System.out.println("Hello %s 123 world!".replaceAll(".*", "_"));
        System.out.println("Hello %s 123 world!".replaceAll(".+", "_"));

        System.out.println("Hello %s 123 world!".replaceFirst(".", "_"));
        System.out.println("Hello %s 123 world!".replaceFirst("H[.]", "_"));



        System.out.println("abc A a e!q".replaceAll("[a-z\\se]", "_"));



        String emails = """
                john.boy@valid.com
                john.boy@invalid
                jane.doe-smith@valid.co.uk
                jane_Doe1976@valid.co.uk
                bob-1964@valid.net
                bob!@invalid.com
                elaine@valid-test.com.au
                elaineinvalid1983@.com
                david@valid.io
                david@invalid..com
                .e323@gmail.com
                """;

        Pattern regex = Pattern.compile("(\\w+-*[.]*\\w+)@\\w+([.-][(\\w)-]{2,}){1,2}", Pattern.CASE_INSENSITIVE);
        Matcher matcher = regex.matcher(emails);

        matcher.results()
                .forEach(s -> {
                    System.out.println(s.group(1));
                    System.out.println(s.group(2));

                });

        int t = 0;
        Integer p = 0;



    }
}