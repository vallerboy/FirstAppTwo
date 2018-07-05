import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String userAnswer;
        do {
            //Menu
            System.out.println("1 - mnożenie");
            System.out.println("2 - dzielenie");
            //

            System.out.print("Podaj opcję: ");
            userAnswer = scanner.nextLine();

            //Math.sqrt()

            switch (userAnswer) {
                case "1": {
                    System.out.print("Podaj liczbę 1: ");
                    int number = Integer.parseInt(scanner.nextLine());
                    System.out.print("Podaj liczbę 2: ");
                    int number1 = Integer.parseInt(scanner.nextLine());


                    System.out.println("Wynik to: " + number * number1);
                    break;
                }
                default: {
                    System.out.println("Nie znam takiej opcji");
                }
            }

        } while (!userAnswer.equals("exit"));
    }
}
