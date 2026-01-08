package referenceMethod;

import java.util.function.Consumer;

public class InstanceMethodReferenceExample {

    public static void main(String[] args) {

        Consumer<String> printer = System.out::println;

        printer.accept("Hello Java");
    }
}

