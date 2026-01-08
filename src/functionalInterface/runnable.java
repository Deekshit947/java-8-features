package functionalInterface;

public class runnable {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Thread running");
            }
        };

        new Thread(r).start();
    }
}

