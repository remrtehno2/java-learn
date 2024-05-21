import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparator<Employee> {
    private String name;
    private double yoe;

    public Employee(String name, double yoe) {
        this.name = name;
        this.yoe = yoe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getYoe() {
        return yoe;
    }

    public void setYoe(double yoe) {
        this.yoe = yoe;
    }

    public void print() {
        System.out.printf("Name: %s, YoE: %s \n", name, yoe);
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) ( o2.yoe - o1.yoe);
    }
}

public class Challenge {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>(List.of(
                new Employee("Mark", 2008),
                new Employee("Denis", 2001),
                new Employee("Andrew", 2021)
        ));

        printEmployees(employees);

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());

//                int currentYear = LocalDate.now().getYear();
//                return (int) (currentYear - o1.getYoe());
                ///return (int) ( o1.getYoe() - o2.getYoe());
            }
        });

//        Collections.sort(employees);

        printEmployees(employees);

    }

    private static void printEmployees(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            employee.print();
        }
    }
}
