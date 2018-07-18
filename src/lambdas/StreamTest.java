package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names =
                Arrays.asList("Oskar", "Oskar", "Dorota", "Kamil", "Damian", "Marcin", "Kamilaabc");

        System.out.println(names.stream()
                .filter(s -> s.endsWith("a"))
                .mapToInt(s -> s.length())
                //.boxed() - powrót do strumienia obiektów
                .sum());

        names.stream()
                .map(s -> s.charAt(0))
                .forEach(s -> System.out.println(s));


        String toCoPodalGocsiuWKonsoli  = "o";

        System.out.println(names.stream()
                .map(s -> s.toLowerCase())
                .anyMatch(s -> s.startsWith(toCoPodalGocsiuWKonsoli.toLowerCase())));

        System.out.println(names.stream()
                .sorted((s, s1) -> s.compareTo(s1) * -1)
                .limit(5)
                .distinct()
                .max((s, s1) -> Integer.compare(s.length(), s1.length()))
                .get());

        List<String> cosiekNew = names.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());

        Map<Integer, List<String>> counting = names.stream()
                .collect(Collectors.groupingBy(s -> s.length()));

        System.out.println(counting);


    }
}
