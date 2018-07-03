import java.util.Scanner;

public class Task8Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String correctPassword = "Polska";

        String typedPassword;
        do{
            System.out.print("Podaj haslo: ");
            typedPassword = scanner.nextLine();
        }while (!typedPassword.equals(correctPassword));
        System.out.println("Brawo, zalogowano!");

    }
}
