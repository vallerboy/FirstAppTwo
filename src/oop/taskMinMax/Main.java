package oop.taskMinMax;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Integer[] ints = {1,23,325,2,4,12};
        GenericArray<Integer> genericArray = new GenericArray<>(ints);
        MinMax<Integer> minMax = genericArray.getMinMax();

        System.out.println(minMax.getFirst());
        System.out.println(minMax.getLast());

        sum(1, 5.4f, 1D, 1.22222,1235L);


    }


    public static <T extends Number> Number sum(T ... whatToSum){
        double sum = 0;
        for (T t : whatToSum) {
            sum += t.doubleValue();
        }
        return sum;
    }


}
