import java.util.Arrays;

public class Task11Arrays {
    public static void main(String[] args) {
        int[] ints = {1,2,3};
        int k = 3   ;
        int[] newInts = new int[ints.length];


        for (int i = 0; i < ints.length; i++) {
            newInts[(k + i) % ints.length] = ints[i];
        }


        //wyswietlenie
        System.out.println(Arrays.toString(newInts));
    }
}
