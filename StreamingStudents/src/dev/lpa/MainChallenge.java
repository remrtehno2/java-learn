package dev.lpa;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainChallenge {
    public boolean t() {
        return true;
    }
    public static void main(String[] args) {
        Course pymc = new Course("PYMC", "Python Masterclass", 50);
        Course jmc = new Course("JMC", "Java Masterclass", 100);
        Course cgi = new Course("CGI", "Creating Games in Java");

        var listOfSTUDENTS = Stream.generate(() -> Student.getRandomStudent(jmc, pymc))
                .limit(5000).toList();

/*
        var average = listOfSTUDENTS.stream()
                .map(val -> val.getPercentComplete("JMC"))
                .reduce(0.0, (a, b) -> {
            return a + b;
        }) / listOfSTUDENTS.size();

        System.out.println(average);

        Stream<Student> studentStream = listOfSTUDENTS.stream()
                .filter(st -> st.getPercentComplete("JMC") >= (average * 1.25))
                .limit(10)
                .sorted(Comparator.comparing(Student::getYearEnrolled));

        studentStream.forEach(s -> {
            s.addCourse(cgi);
        });


        Stream<Student> studentStream2 = listOfSTUDENTS.stream()
                .filter(st -> st.getPercentComplete("JMC") >= (average * 1.25))
                .limit(10)
                .sorted(Comparator.comparing(Student::getYearEnrolled));

        System.out.println(studentStream2.toList());


        var listOfSTUDENTS2 = Stream.generate(() -> Student.getRandomStudent(jmc, pymc))
                .limit(5000).toList();

        var t2 = listOfSTUDENTS2.stream()
                .collect(Collectors.partitioningBy(Student::hasProgrammingExperience));

        Predicate<? super Student> pd = (ty) -> {
            return true;
        };

//        listOfSTUDENTS2.stream().flatMap()

*/
        listOfSTUDENTS.stream()
                .limit(10)
                .collect(
                        Collectors.groupingBy(Student::getGender, Collectors.counting())
                )
                .forEach((k, v) -> System.out.println("Key: " + k + " = " + v) );
    }
}
