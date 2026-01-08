package functionalInterface;

import java.util.*;

public class funcInterface {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 1, 3);

        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });

        System.out.println(list);
    }
}
