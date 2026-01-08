package lambdaExpressions;

import java.util.function.Predicate;

public class even {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(10));
        System.out.println(isEven.test(7));
    }
}

