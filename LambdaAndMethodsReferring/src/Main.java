import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String t = """

До 2016 года для работы станции Украина закупа
ла ядерное топливо у российской компании ТВЭЛ. В 2008 году «Эн
ергоатом» и Westinghouse Electric Company подписали контракт на поставку 
топлива для украинских реакторов начиная с 2011 года. ЗАЭС и Южно-Украинская АЭС были 
выбрана в качестве опытных площадок для проекта по внедрению нового топлива. Однако при пробном
 испытании нового топлива на Южно-Украинской АЭС часть топливных сборок деформировалась, что привело к
  повреждению реактора. В результате Украина приостановила использование нового топлива и потребовала о
  т Westinghouse провести редизайн топливных сборок. После смены правительства в 2014 году контракт был 
  возобновлён и продлён. В начале 2018 года «Энергоатом» и Westinghouse Electric продлили контракт до 2025
   года[25][26]. В феврале 2016 года на ЗАЭС поступила первая партия топлива производства
 Westinghouse Electric, которая была загружена в энергоблок №
  5. Первые три года р
 еактор дей
    
               """;


        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 20));

        // Comparator class to compare Person objects based on age
        class AgeComparator implements Comparator<Person> {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        }

        /*

                        (p1, p2) -> {
                            return Integer.compare(p1.getAge(), p2.getAge());
                        }


 */
        // Sorting using an anonymous class
//        Collections.sort(people, new AgeComparator());

        people.sort((p1, p2) -> {
            System.out.println("Сработала лямба");
            return Integer.compare(p1.getAge(), p2.getAge());
        });




//        // Print sorted list
//        for (Person person : people) {
//            System.out.println(person.getName() + ": " + person.getAge());
//        }

//        people.forEach( (element) -> {
//            System.out.println(element.getName()  + ": " + element.getAge() + " !!! ");
//        });
//
        people.forEach(
                element -> System.out.println(element.getName()  + ": " + element.getAge() + " !!! ")
        );




        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Orange");

        // Using method reference to print each string

//        var t2 = System.out::println;
        var y = new PrintClass();
        strings.forEach( y::print );
        // t2();
    }
}