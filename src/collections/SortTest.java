package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(1, 2);
        WeatherData weatherData1 = new WeatherData(5, 7);
        WeatherData weatherData2 = new WeatherData(6, 2);
        WeatherData weatherData3 = new WeatherData(3, 9);

        tryToSort(weatherData, weatherData1);

    }

    //Needs compareTo method
    public static void tryToSort(Comparable o, Object o1){
        System.out.println(o.compareTo(o1));
    }
}
