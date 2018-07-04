import java.util.Scanner;

public class Task14Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();


        if (number == 2) {
            System.out.println("pierwsza");
            System.exit(0);
        } else if (number == 1) {
            System.out.println("nie pierwsza");
            System.exit(0);
        }

        boolean isPrimeNumber = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }

        if (isPrimeNumber) {
            System.out.println("pierwsza");
        }

    }
}
