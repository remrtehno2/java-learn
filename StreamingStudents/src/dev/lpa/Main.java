package dev.lpa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Course pymc= new Course("PYMC", "Python Masterclass");
        Course jmc= new Course("JMC", "Java Masterclass");
//        Student tim = new Student("AU", 2019, 30, "M",
//                true, jmc, pymc);
//        System.out.println(tim);
//
//        tim.watchLecture("JMC", 10, 5, 2019);
//        tim.watchLecture("PYMC", 7, 7, 2020);
//        System.out.println(tim);

        Map<String, ArrayList<Student>> mapSt = new HashMap<>();
        Map<Integer, ArrayList<Student>> agedSt = new HashMap<>();

        Stream.generate(() -> Student.getRandomStudent(jmc, pymc))
                .limit(50)
//                .map(Student::getGender)
                .forEach((Student student) -> {
                    mapSt.compute(student.getGender(), (oldKey, oldVal) -> {
                        if(oldVal == null) {
                            return new ArrayList<Student>(List.of(student));
                        }

                        oldVal.add(student);

                        return oldVal;
                    });

                    int age;

                    if(student.getAge() < 30) {
                        age = 30;
                    } else if (student.getAge() > 30 && student.getAge() < 60) {
                        age = 45;
                    } else {
                        age = 60;
                    }
                    agedSt.compute(age, (oldKey, oldVal) -> {
                        if(oldVal == null) {
                            return new ArrayList<Student>(List.of(student));
                        }

                        oldVal.add(student);

                        return oldVal;
                    });
                });


//        Stream<Student> MStudens = generalStream.filter(val -> val.getGender().equals("M"));
//        Stream<Student> FStudens = generalStream.filter(val -> val.getGender().equals("F"));
//
//        var total = Stream.concat(MStudens, FStudens).count();
//
//        System.out.printf("F: %s, M: %s \n");
        mapSt.forEach((key, val) -> {
            System.out.println(key + " : " + val.size());
        });

        agedSt.forEach((key, val) -> {
            System.out.println(key + " : " + val.size());
        });





                /*
                .forEach((val) -> {
                    if(val.getAge() < 30) {
                        mapSt.compute(30, (key, oldValue) -> {
                            if (oldValue == null) {
                                oldValue = new ArrayList<>();
                            }
                            oldValue.add(val);
                            return oldValue;
                        });
                    }
                });


        System.out.println(mapSt); */

    }
}
