package lambdas.taskslack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task8Slack {
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

        //Sposób I
        long count = people.stream()
                .distinct()
                .count();

        System.out.println(people.size() - count);

        //Sposób II
        List<Person> listWithoutDoubles = people.stream()
                .distinct()
                .collect(Collectors.toList());


         System.out.println(people.size() - listWithoutDoubles.size());
    }
}
