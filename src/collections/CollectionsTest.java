package collections;

import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {


        Set<WeatherData> someList = new LinkedHashSet<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            someList.add(new WeatherData(i, i));
        }
        long stopTime = System.currentTimeMillis();

        System.out.println(stopTime - startTime);


        for (WeatherData weatherData : someList) {
           // System.out.println(weatherData.getTemp());
        }

        Map<String, String> map = new HashMap<>();
        map.put("dog", "pies");
        map.put("cat", "kot");
        map.put("house", "dom");

        System.out.println(map.get("dog"));
        System.out.println(map.containsValue("pies"));

        for (String s : map.keySet()) {
            //po kluczach
        }

        for (String s : map.values()) {
            //po wartosciach
        }


        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            //po tym i po tym
           // System.out.println(
           //         stringStringEntry.getValue() + " " + stringStringEntry.getKey());
        }


    }

    public static  void printLists(List<String> someData){
        for (String someDatum : someData) {
            System.out.println(someDatum);
        }
    }
}
