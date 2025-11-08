package dev.lpa;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public class StreamFinalChallenge {
    public static void main(String[] args) {
        Course pymc = new Course("PYMC", "Python Masterclass", 50);
        Course jmc = new Course("JMC", "Java Masterclass", 100);
        Course cgi = new Course("CGI", "Creating Games in Java");

        var students = IntStream
                .rangeClosed(0, 10000)
                .mapToObj((i) -> Student.getRandomStudent(pymc, jmc, cgi))
                .toList();


        var mappedActivity = students.stream()
                .flatMap(s -> s.getEngagementMap().values().stream())
                .collect(
                        Collectors.groupingBy(CourseEngagement::getCourseCode, Collectors.counting())
                );

//        mappedActivity.forEach((k, v) -> System.out.println(k + " " + v));

        System.out.println(mappedActivity);

        var avgCourses = students.stream()
                .limit(2)
//                .flatMap(s -> s.getEngagementMap().values().stream())
                .collect(
                        Collectors.groupingBy(Student::getEngagementMap, Collectors.counting())
                );

        System.out.println(avgCourses);


//        var percentages = students.stream()
//                .flatMap(s -> s.getEngagementMap().values().stream())
//                .collect(Collectors.groupingBy(CourseEngagement::getCourseCode,
//                        Collectors.summarizingDouble(CourseEngagement::getPercentComplete)));
//
//        percentages.forEach((k, v) -> System.out.println(k + " " + v));


        var classCounts = students.stream()
                .collect(Collectors.groupingBy(s -> s.getEngagementMap().size(),
                        Collectors.counting()));

        classCounts.forEach((k, v) -> System.out.println(k + " " + v));


        System.out.println(students.stream().limit(5).toList());

        var grpByCountryCode = students.stream()
                .collect(Collectors.groupingBy(Student::getCountryCode, Collectors.counting()));

        System.out.println(grpByCountryCode);

        var grpByGender = students.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));

        System.out.println(grpByGender);


        var grpByYears = students.stream()
                .flatMap(s -> s.getEngagementMap().values().stream())
                .collect(groupingBy(CourseEngagement::getEnrollmentYear, counting()));//.collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));

        System.out.println(grpByYears);
//        System.out.println(students.get(0).getEngagementMap().get("JMC").getEnrollmentYear());


        var byCourseCount = students.stream()
                .flatMap(s -> s.getEngagementMap().values().stream())
                .collect(groupingBy(CourseEngagement::getCourseCode, counting()));

        System.out.println(byCourseCount);

        var byLastACtv = students.stream()
                .flatMap(s -> s.getEngagementMap().values().stream())
                .collect(groupingBy(CourseEngagement::getLastActivityYear, counting()));

        System.out.println(byLastACtv);


        var byLastACtv2 = students.stream()
                .flatMap(s -> s.getEngagementMap().values().stream())
                .collect(
                        groupingBy(
                                CourseEngagement::getCourseCode,
                                Collectors.groupingBy(CourseEngagement::getLastActivityYear, Collectors.counting())
                        )
                );

        System.out.println(byLastACtv2);


        var determAvgPercentage = students.stream()
                .flatMap(s -> s.getEngagementMap().values().stream())
                        .collect(groupingBy(CourseEngagement::getCourseCode, averagingDouble(CourseEngagement::getPercentComplete)));

        System.out.println(determAvgPercentage);
    }
}
