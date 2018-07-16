package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {

        LinkedList<String> someList = new LinkedList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            someList.add(0,"sadasd" + i);
        }
        long stopTime = System.currentTimeMillis();

        System.out.println(stopTime - startTime);
    }

    public static  void printLists(List<String> someData){
        for (String someDatum : someData) {
            System.out.println(someDatum);
        }
    }
}
