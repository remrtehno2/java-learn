import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var list = new ArrayList<>(List.of("Test", "Test 2"));

        var t =  list.stream()
                .filter(s -> s.equals("Test"))
                .toList();

        System.out.println(list);
        System.out.println(t);

        var list2 = new ArrayList<>(List.of("Test", "Test 2"));

        // Императивный подход
        var t2 = new ArrayList<String>();
        for (String s : list) {
            if (s.equals("Test")) {
                t2.add(s);
            }
        }

        System.out.println(list2);
        System.out.println(t2);


        //



        List<User> users = new ArrayList<>();
        // Добавление пользователей в список (пример)
        users.add(new User("Alice", 25));
        users.add(new User("Bob", 35));
        users.add(new User("Charlie", 32));

        List<User> result = users.stream()
                .filter(user -> user.getAge() > 30)
                .collect(Collectors.toList());

        // pipe - pipeline

        // Вывод результата
        result.forEach(user -> System.out.println(user.getName()));
//        System.out.println(result);



        //


        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 25),
                new Employee("Bob", 35),
                new Employee("Charlie", 32),
                new Employee("David", 28)
        );

        List<String> employeeNames = employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .map(Employee::getName)
                .map()
                .map()
                .collect(Collectors.toList())
                ;

        employeeNames.forEach(System.out::println);

    }
}


class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}