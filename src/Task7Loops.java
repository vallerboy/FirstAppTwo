import java.util.Random;

public class Task7Loops {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i <= 5; i++) {
            System.out.println(random.nextInt(49) + 1);
        }

    }
}
