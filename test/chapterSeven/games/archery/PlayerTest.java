package chapterSeven.games.archery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    private Player player;

    @BeforeEach
    public void setUp(){
        player=new Player(1);
    }

    @Test
    public void testThatPlayerCanBeCreated(){
        assertNotNull(player);
    }

    @Test
    public void testThatPlayerCanPlay(){
        int[][] scoreBoard = new int[1][1];
        for(int[] row:scoreBoard){
            Arrays.fill(row, -1);
        }
        player.play(scoreBoard);
        assertTrue(scoreBoard[0][0]>=0
                &&scoreBoard[0][0]<=10);
    }
}
