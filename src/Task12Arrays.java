import java.util.Arrays;

public class Task12Arrays {
    public static void main(String[] args) {
        int[] pairs = {11,12,14,15,11,14,12,15,16};

        Arrays.sort(pairs);

        for (int i = 0; i < pairs.length; i += 2) {
            if(i == pairs.length - 1){
                System.out.println("Ostatnia liczba nie ma pary, " + pairs[i]);
                break;
            }

            if(pairs[i] != pairs[i + 1]){
                System.out.println("nie ma pary liczba " + pairs[i]);
                break;
            }
        }
    }
}
