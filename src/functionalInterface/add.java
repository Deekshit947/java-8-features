package functionalInterface;

@FunctionalInterface
interface Addition {
    int sum(int a, int b);
}

public class add {
    public static void main(String[] args) {
        Addition add = new Addition() {
            public int sum(int a, int b) {
                return a + b;
            }
        };

        System.out.println(add.sum(10, 20));
    }
}

