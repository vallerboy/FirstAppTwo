public class Task6Arrrays {
    public static void main(String[] args) {

        int[] ints = {1,2,3,4,5,6,7,8,1,1,22,3,4};

        int sum = 0;
        for (int anInt : ints) {
            sum += anInt;
        }

        for (int anInt : ints) {
            System.out.print(sum + " ");
            sum -= anInt;
        }
        /////////////////////

        System.out.println();

        for (int i = 0; i < ints.length; i++) {
            int sum1 = 0;
            for (int i1 = i; i1 < ints.length; i1++) {
                sum1 += ints[i1];
            }

            System.out.print(sum1 + " ");
        }
    }
}
