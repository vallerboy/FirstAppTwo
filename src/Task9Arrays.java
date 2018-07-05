import java.util.Random;

public class Task9Arrays {
    public static void main(String[] args) {
        final int n = 39;
        final int k = 10;

        Random random = new Random();

        int counter = 0;
        for (int i = 0; i < n; i++) {
            int randomNumber = random.nextInt(100);
            if(randomNumber == k){
                counter++;
            }
        }

        System.out.println("Wystapien K jest " + counter);
    }
}
