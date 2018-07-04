public class Task4Arrays {
    public static void main(String[] args) {

        int[] ints = {12,2,3213,32,2,123,3,213,34,123124,12};

        int sum = 0;
        for (int anInt : ints) {
            sum += anInt;
        }

        System.out.println("Suma: " +  sum);
        System.out.println("Srednia: " + (sum / (double) ints.length));
    }
}
