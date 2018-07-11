import java.util.Arrays;

public class KingArray {
    public static void main(String[] args) {
        int[] ints =  {1,3,3,3,3,3,3,6,7,8,9};
        Arrays.sort(ints);

        int candidate = ints[ints.length / 2];

        int counter = 0;
        for (int anInt : ints) {
            if(anInt == candidate){
                counter ++;
            }
        }

        if(counter >= ints.length / 2){
            System.out.println("Mamy króla");
        }else{
            System.out.println("Nie ma króla");
        }
    }
}
