package parallelSort;

import java.util.Arrays;
import java.util.Comparator;

public class parallelSortDemo {

    public static void main(String[] args) {

        int[] numbers = {9, 3, 7, 1, 5};

        Arrays.parallelSort(numbers);
        System.out.println("Parallel Sorted (int): "
                + Arrays.toString(numbers));

        int[] rangeArray = {9, 8, 7, 6, 5, 4};

        Arrays.parallelSort(rangeArray, 1, 4);
        System.out.println("Range Sorted: "
                + Arrays.toString(rangeArray));

        String[] names = {"John", "Alice", "Bob", "David"};

        Arrays.parallelSort(names);
        System.out.println("Parallel Sorted (String): "
                + Arrays.toString(names));

        String[] languages = {"Java", "Python", "C++"};

        Arrays.parallelSort(languages,
                Comparator.reverseOrder());
        System.out.println("Reverse Sorted: "
                + Arrays.toString(languages));
    }
}

