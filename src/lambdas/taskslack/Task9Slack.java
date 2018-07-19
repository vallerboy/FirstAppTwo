package lambdas.taskslack;

import java.util.ArrayList;
import java.util.List;

public class Task9Slack {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person jakisPerson = new Person("Adam", "Nawałka", 10);
        people.add(jakisPerson);
        people.add(new Person("Adam", "Nawałka", 10));
        people.add(new Person("Tomek", "Nawałka", 10));
        people.add(new Person("Ktoś", "Nawałka", 11));
        people.add(new Person("Siema", "Nijaki", 10));
        people.add(new Person("Ema", "Nijaki", 10));
        people.add(new Person("Ema", "Nijaki", 10));
        people.add(new Person("Ema", "Nijaki", 10));
        people.add(new Person("Oskar", "Polak", 10));

        people.stream()
                .map(s -> new Animal(s.getName() + s.getSurname(), s.getAge() / 10))
                .forEach(s -> System.out.println(s));
    }
}
