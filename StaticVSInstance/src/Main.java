public class Main {
    public static void main(String[] args) {
        Task t1 = new Task("Выкини мусор");
        Task t2 = new Task("Помой посуду");

//        t1.status = "QUEUE";
//        t2.status = "queue";

//        t1.status = "COMPETED";
//        t2.status = "completed_";

        t1.status = Task.STATUES[0];
        t2.status = Task.STATUES[0];


        t1.status = Task.STATUES[2];
        t2.status = Task.STATUES[2];
        /*
            QUEUE
            IN_PROGRESS
            COMPETED

         */







        User.printId();

        User.id++;
        User.id++;

        // Instance
        User user1 = new User("User 1");
        User user2 = new User("User 2");
        User user3 = new User("User 1");
        User user4 = new User("User 2");

        user1.print();
        user2.print();

        user1.printId();
        user2.printId();
        user3.printId();
        user4.printId();
    }
}