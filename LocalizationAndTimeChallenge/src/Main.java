import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        var dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        for (var locale : List.of(Locale.US, Locale.UK)) {
            System.out.println(
                    locale.getDisplayName() + "= " + LocalDateTime.now().format(dtf.withLocale(locale))
            );


            Period timePast2 = Period.between(LocalDate.EPOCH, LocalDateTime.now().toLocalDate());
            System.out.println(timePast2);
        }


        System.out.println(
                LocalDateTime.now().format(dtf.withLocale(Locale.US))
        );

        Instant instantNow = Instant.now();
        System.out.println(instantNow);

        for (ZoneId z : List.of(
                ZoneId.of("Australia/Sydney"),
                ZoneId.of("Europe/Paris"),
                ZoneId.of("America/New_York"))) {

            System.out.println(z);

 

        }



    }
}