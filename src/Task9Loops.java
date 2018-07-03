import java.math.BigInteger;
import java.util.Scanner;

public class Task9Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        BigInteger sum = new BigInteger("1");

        for (int i = 1; i <= n; i++) {
            sum = sum.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(sum.toString().length());
    }
}
