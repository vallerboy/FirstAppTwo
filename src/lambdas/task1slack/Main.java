package lambdas.task1slack;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person jakisPerson = new Person("Adam", "Nawałka", 10);

        people.add(jakisPerson);
        people.add(new Person("Adam", "Nawałka", 10));
        people.add(new Person("Tomek", "Nawałka", 10));
        people.add(new Person("Ktoś", "Nawałka", 11));
        people.add(new Person("Siema", "Nijaki", 10));
        people.add(new Person("Ema", "Nijaki", 10));
        people.add(new Person("Oskar", "Polak", 10));

//        Map<String, List<Person>> stringListMap = people.stream()
//                .collect(Collectors.groupingBy((Person s) -> s.getSurname()));
//
//
//       stringListMap.entrySet()
//                .stream()
//                .max((s, s1) -> Integer.compare(s.getValue().size(), s1.getValue().size()))
//                .ifPresent(s -> System.out.println(s.getKey()));
//
//        String text = null;
//        Optional<String> optional = Optional.ofNullable(text);
//
//        if (optional.isPresent()) {
//            System.out.println(optional.get().length());
//        }

        //Zadanie 2
        System.out.println(people.stream()
                .mapToDouble(s -> s.getAge())
                .average()
                .orElseThrow(() -> new IllegalStateException()));

//        if(optionalDouble.isPresent()){
//            System.out.println(optionalDouble.getAsDouble());
//        }else{
//            System.out.println("User, no niestety, wystapil gdzies null");
//            System.exit(0);
//        }

        //Zadanie 3
       Optional<Person> person = people.stream()
                .sorted(( s, s1) -> Integer.compare(s.getAge(), s1.getAge()) * -1)
                .limit(1)
                .map(s -> new Person("Mędrzec: " + s.getName(), s.getSurname(), s.getAge()))
                .findAny();

       if(person.isPresent()){
           System.out.println("zrob cos");
           System.out.println(person.get());
       }


    }
}

















