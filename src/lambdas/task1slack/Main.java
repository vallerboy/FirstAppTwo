package lambdas.task1slack;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Adam", "Nawałka", 10));
        people.add(new Person("Tomek", "Nawałka", 10));
        people.add(new Person("Ktoś", "Nawałka", 10));
        people.add(new Person("Siema", "Nijaki", 10));
        people.add(new Person("Ema", "Nijaki", 10));
        people.add(new Person("Oskar", "Polak", 10));

        System.out.println(people.stream()
                .collect(Collectors.groupingBy(s -> s.getSurname()))
                .entrySet()
                .stream()
                .max((s, s1) -> Integer.compare(s.getValue().size(), s1.getValue().size()))
                .get()
                .getKey());

    }
}
