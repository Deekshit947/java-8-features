package lambdaExpressions;

public class runnable1 {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Thread running using lambda");
        new Thread(r).start();
    }
}

