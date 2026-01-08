package referenceMethod;

import java.util.function.Function;

public class StaticMethodReferenceExample {

    public static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {

        Function<Integer, Integer> f = StaticMethodReferenceExample::square;

        System.out.println(f.apply(5)); // 25
    }
}

