package lambdaExpressions;

import java.util.*;

public class maps {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Spring");
        map.put(3, "Docker");

        map.forEach((key, value) ->
                System.out.println(key + " : " + value)
        );
    }
}

