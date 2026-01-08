package functionalInterface;

@FunctionalInterface
interface Task {
    void execute();

    String toString(); // from Object class
}

public class objMethod {
    public static void main(String[] args) {
        Task t = new Task() {
            public void execute() {
                System.out.println("Task executed");
            }
        };

        t.execute();
    }
}

