package referenceMethod;

import java.util.function.Function;

public class ArbitraryObjectMethodReferenceExample {

    public static void main(String[] args) {

        Function<String, Integer> length = String::length;

        System.out.println(length.apply("Lambda")); // 6
    }
}
