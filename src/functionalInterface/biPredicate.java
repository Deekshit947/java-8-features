package functionalInterface;

import java.util.function.BiPredicate;

public class biPredicate {

    public static void main(String[] args) {

        // BiPredicate: check if first number is greater than second
        BiPredicate<Integer, Integer> isGreater =
                (a, b) -> a > b;

        System.out.println(isGreater.test(10, 5)); // true
        System.out.println(isGreater.test(3, 7));  // false
    }
}
