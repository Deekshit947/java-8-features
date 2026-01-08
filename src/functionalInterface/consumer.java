package functionalInterface;

import java.util.function.Consumer;

public class consumer {

    public static void main(String[] args) {

        // Consumer: prints a number
        Consumer<Integer> printNumber =
                n -> System.out.println(n);

        printNumber.accept(10);  // Output: 10
        printNumber.accept(25);  // Output: 25
    }
}
