package oop.taskMinMax;

public class Main {
    public static void main(String[] args) {
        Integer[] ints = {1,23,325,2,4,12};
        GenericArray<Integer> genericArray = new GenericArray<>(ints);
        MinMax<Integer> minMax = genericArray.getMinMax();

        System.out.println(minMax.getFirst());
        System.out.println(minMax.getLast());
    }

    
    public static <T extends Number> Number sum(T ... whatToSum){
        double sum = 0;
        for (T t : whatToSum) {
            sum += t.doubleValue();
        }
        return sum;
    }
}
