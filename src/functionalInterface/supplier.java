package functionalInterface;

import java.util.function.Supplier;

public class supplier {

    public static void main(String[] args) {

        // Supplier: returns a message
        Supplier<String> messageSupplier =
                () -> "Hello Java";

        System.out.println(messageSupplier.get());
    }
}
