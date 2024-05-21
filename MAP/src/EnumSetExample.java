import java.util.*;

public class EnumSetExample {
    enum DaysOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        EnumSet<DaysOfWeek> weekend = EnumSet.of(DaysOfWeek.SATURDAY, DaysOfWeek.SUNDAY);
        EnumSet<DaysOfWeek> weekdays = EnumSet.complementOf(weekend);
        var monToFri = EnumSet.range(DaysOfWeek.MONDAY, DaysOfWeek.SATURDAY);

        System.out.println("Weekends: " + weekend);
        System.out.println("Weekdays: " + weekdays);
        System.out.println("Range: " + monToFri);


//        =================================
        enum WeekDay {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

        List<WeekDay> annsWorkDays = new ArrayList<>(List.of(WeekDay.MONDAY,
                WeekDay.TUESDAY, WeekDay.THURSDAY, WeekDay.FRIDAY));
//        annsWorkDays.add(DaysOfWeek.MONDAY);

        var annsDaysSet = EnumSet.copyOf(annsWorkDays);
        System.out.println(annsDaysSet.getClass().getSimpleName());
        annsDaysSet.forEach(System.out::println);

        var allDaysSet = EnumSet.allOf(WeekDay.class);
        System.out.println("---------------------");
        allDaysSet.forEach(System.out::println);

        Set<WeekDay> newPersonDays = EnumSet.complementOf(annsDaysSet);
        System.out.println("---------------------");
        newPersonDays.forEach(System.out::println);

        Set<WeekDay> anotherWay = EnumSet.copyOf(allDaysSet);
        anotherWay.removeAll(annsDaysSet);
        System.out.println("---------------------");
        anotherWay.forEach(System.out::println);

        Set<WeekDay> businessDays = EnumSet.range(WeekDay.MONDAY, WeekDay.FRIDAY);
        System.out.println("---------------------");
        businessDays.forEach(System.out::println);

        Map<WeekDay, String[]> employeeMap = new EnumMap<>(WeekDay.class);

        employeeMap.put(WeekDay.FRIDAY, new String[]{"Ann", "Mary", "Bob"});
        employeeMap.put(WeekDay.MONDAY, new String[]{"Mary", "Bob"});
        employeeMap.forEach(
                (k, v) -> System.out.println(k + " : " + Arrays.toString(v)));
    }
}
