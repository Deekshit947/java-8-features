package optionalDemo;

import java.util.Optional;

public class optional {

    public static void main(String[] args) {

        Optional<String> name = Optional.ofNullable("Java");

        name.ifPresent(n -> System.out.println("Value: " + n));

        String result = name.orElse("Default");
        System.out.println("orElse: " + result);

        name.map(n -> n.toUpperCase())
                .ifPresent(n -> System.out.println("Uppercase: " + n));

        name.filter(n -> n.length() > 3)
                .ifPresent(n -> System.out.println("Length > 3: " + n));

        Optional<String> empty = Optional.empty();

        System.out.println("Empty orElse: " + empty.orElse("No Value"));

    }
}

