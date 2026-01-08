package lambdaExpressions;

import java.util.*;

public class streams1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20);

        numbers.stream()
                .filter(n -> n > 10)
                .map(n -> n * 2)
                .forEach(n -> System.out.println(n));
    }
}

