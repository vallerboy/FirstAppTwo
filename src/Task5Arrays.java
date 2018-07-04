public class Task5Arrays {
    public static void main(String[] args) {
        int ints[] = {2,33,3,214,2,13,23,13,5,12,3213,23,123};

        int max = ints[0];
        int min = ints[0];

        for (int anInt : ints) {
            max = max < anInt ? anInt : max;
            min = min > anInt ? anInt : min;
        }

        System.out.println(max);
        System.out.println(min);
    }
}
