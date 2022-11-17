package chapterSeven.games.archery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArcheryGameTest {
    private ArcheryGame game;

    @BeforeEach
    public void setUp(){
        game = new ArcheryGame(1);
    }

    @Test
    public void testThatArcheryGameExists(){
        assertNotNull(game);
    }

    @Test
    public void testThatPlayersCanExistInArcheryGame(){
        Player[] players = game.getPlayers();
        assertNotNull(players);
        assertTrue(players.length>0);
    }
    @Test
    public void testThatGameHasPlayer(){
      Player[] players = game.getPlayers();
      Player player = players[0];
      assertNotNull(player);
    }



}