public class Task {
    public String project;
    public String description;
    public String assignee;
    public String priority;
    public String status;

    public Task(String assignee, String project, String description, String priority, String status) {
        this.project = project;
        this.description = description;
        this.assignee = assignee;
        this.priority = priority;
        this.status = status;
    }

    @Override
    public String toString() {
        return project + ", " +  description + ", " + priority;
    }
}
