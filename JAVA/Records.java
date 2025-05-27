import java.util.*;
import java.util.stream.*;

record Person(String name, int age) {}

public class Records{
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Alice", 22),
            new Person("Bob", 17),
            new Person("Charlie", 25)
        );

        // Print all persons
        people.forEach(System.out::println);

        // Filter adults (age >= 18)
        List<Person> adults = people.stream()
                                    .filter(p -> p.age() >= 18)
                                    .toList();

        System.out.println("Adults: " + adults);
    }
}
