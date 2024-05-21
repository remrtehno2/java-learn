import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> forAnn = new HashSet<>();
    private Set<Task> forBob = new HashSet<>();
    private Set<Task> forCarol = new HashSet<>();

    public TaskData() {
        forAnn.add(new Task("Ann", "HPE", "comp", "HIGH", "IN Progress"));
        forAnn.add(new Task("Ann", "APPLE", "CREATE", "HIGH", "BLOCKED"));

        forBob.add(new Task("BOB", "Samsung", "phone comp", "LOW", "IN Progress"));

        forCarol.add(new Task("Carol", "Sony", "playstation", "MEDIUM", "IN QUEUE"));
    }


    private String tasks;
    private String annTasks;
    private String bobTasks;
    private String carolTasks;


    public void printTasks(String name) {
        if (name == "Ann") {
            annTasks();
        }
        if (name == "Bob") {
            bobTasks();
        }
        if (name == "Carol") {
            carolTasks();
        }
        if (name == "All") {
            annTasks();
            bobTasks();
            carolTasks();
        }
    }

    public void annTasks() {
        System.out.println("Ann's tasks: ");
        int i = 0;
        for (var task1 : forAnn) {
            i++;
            System.out.println("\t" + i + " " + task1);
        }
        System.out.println("-".repeat(90));
    }

    public void carolTasks() {
        System.out.println("Carol's tasks: ");
        int j = 0;
        for (var task1 : forCarol) {
            j++;
            System.out.println("\t" + j + " " + task1);
        }
        System.out.println("-".repeat(90));
    }

    public void bobTasks() {
        System.out.println("Bob's tasks: ");
        int k = 0;
        for (var task1 : forBob) {
            k++;
            System.out.println("\t" + k + " " + task1);
        }
        System.out.println("-".repeat(90));
    }
}

