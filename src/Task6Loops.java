import java.util.Scanner;

public class Task6Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int goodAnswer = 242;

        int answer;
        do {
            System.out.print("Podaj odpowiedź: ");
            answer = scanner.nextInt();

            if(answer > goodAnswer) {
                System.out.println("Celuj nizej");
            }else {
                System.out.println("Celuj wyzej");
            }
        }while (answer != goodAnswer);
        System.out.println("Woo! Wygrales");
    }
}
