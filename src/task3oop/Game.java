package task3oop;

public class Game {
    private String name;
    private Player[] players;

    public Game(String name, int playersCount){
        this.name = name;
        players = new Player[playersCount];
    }

    public void addPlayer(Player player){
        for (int i = 0; i < players.length; i++) {
            if(players[i] == null){
                players[i] = player;
                break;
            }
        }
    }

    public Player getGameWinner(){
        Player winner = players[0];
        for (Player player : players) {
            if(winner.getPoints() < player.getPoints()){
                winner = player;
            }
        }
        return winner;
    }

    public String getName() {
        return name;
    }
}
