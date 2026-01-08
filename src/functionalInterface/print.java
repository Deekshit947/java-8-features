package functionalInterface;

@FunctionalInterface
interface Printer {
    void print(String msg);

    default void info() {
        System.out.println("Printing message");
    }
}

public class print {
    public static void main(String[] args) {
        Printer p = new Printer() {
            public void print(String msg) {
                System.out.println(msg);
            }
        };

        p.info();
        p.print("Hello World");
    }
}

