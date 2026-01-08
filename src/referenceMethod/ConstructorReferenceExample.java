package referenceMethod;

import java.util.function.Supplier;

class Person {
    Person() {
        System.out.println("Person object created");
    }
}

public class ConstructorReferenceExample {

    public static void main(String[] args) {

        Supplier<Person> supplier = Person::new;
        supplier.get();
    }
}

