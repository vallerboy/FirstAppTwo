package task3oop;

public class Main {
    public static void main(String[] args) {

        Player player = new Player("Oskar", "Polak", 20);
        Player player1 = new Player("Adam", "Polak", 56);
        Player player2 = new Player("Ktos", "Ktosiowaty", 16);
        Player player3 = new Player("Uliczny", "Denser", 35);


        Game game = new Game("Miejska gra w życie", 4);
        game.addPlayer(player);
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);

        System.out.println(game.getGameWinner().getFullName());
    }
}
