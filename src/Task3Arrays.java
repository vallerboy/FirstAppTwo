import java.util.Arrays;

public class Task3Arrays {
    public static void main(String[] args) {
        int[] ints = {4,2,3,4,5,6,2,3,51,423,123514,3223,1,22,2,2,2,2};


        int currentMaxValue = 0;
        int currentMaxNumber = 0;
        for (int i = 0; i < ints.length; i++) {
            int localCounter = 0;
            for (int i1 = i; i1 < ints.length; i1++) {
                if(ints[i] == ints[i1]){
                    localCounter++;
                }
            }

            if(currentMaxValue < localCounter){
                currentMaxValue = localCounter;
                currentMaxNumber = ints[i];
            }
        }
        System.out.println(currentMaxNumber);

    }
}
