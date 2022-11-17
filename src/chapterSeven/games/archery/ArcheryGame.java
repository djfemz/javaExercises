package chapterSeven.games.archery;

public class ArcheryGame {

    private Player[] players;


    public ArcheryGame(int numberOfArchers){
        players=new Player[numberOfArchers];
        for(int i = 0; i < numberOfArchers; i ++){
            players[i]= new Player(i+1);
        }
    }
    public Player[]  getPlayers() {
        return players;
    }

}
