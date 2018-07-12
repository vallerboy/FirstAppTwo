package oop.task3oop;
import java.util.Random;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Podaj ilość graczy: ");
        int playersCount = Integer.parseInt(scanner.nextLine());

        System.out.println();

        System.out.println("Podaj nazwe gry: a");
        String gameName = scanner.nextLine();

        System.out.println();


        Game game = new Game(gameName, playersCount);
        game.setName("ahahahhaha trollujemy");

        for (int i = 0; i < game.getMaxPlayerCount(); i++) {
            System.out.print("Podaj imie: ");
            String userName = scanner.nextLine();

            System.out.print("Podaj nazwisko: ");
            String surname = scanner.nextLine();

            game.addPlayer(new Player(userName, surname, random.nextInt(200)));
        }

        System.out.println(game.getName() + ": " +game.getGameWinner().getFullName());
    }
}
