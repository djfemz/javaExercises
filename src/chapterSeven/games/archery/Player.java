package chapterSeven.games.archery;

import java.security.SecureRandom;

public class Player {
    private int id;

    public Player(int id){
        this.id=id;
    }

    public void play(int[][] scoreBoard) {
        int score = generateArcherScore();
        if (id==1) {
            int[] playerOnesRow = scoreBoard[0];
            for (int i = 0; i < playerOnesRow.length; i++) {
                if (playerOnesRow[i]==-1) {
                    playerOnesRow[i] = score;
                    break;
                }

            }
        }
    }

    private static int generateArcherScore(){
        SecureRandom random = new SecureRandom();
        return random.nextInt(11);
    }
}
