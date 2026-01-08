package lambdaExpressions;

import java.util.*;
import java.util.stream.*;

public class streams {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 10, 15, 20);

        nums.stream()
                .filter(n -> n > 10)
                .map(n -> n * 2)
                .forEach(n -> System.out.println(n));
    }
}

