package chapterSix;

import chapterSix.coin_toss_exercise.CoinTossGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoinTossGameTest {

    private CoinTossGame coinTossGame;



    @BeforeEach
    public void setUp(){
        coinTossGame=new CoinTossGame();
    }


    @Test
    public void testThatGameExists(){
        assertNotNull(coinTossGame);
    }

    @Test
    public void testMenuOption(){
        String menu=CoinTossGame.getGameMenu();
        assertTrue(menu.equals("""
                1. Toss Coin
                2. Exit Game
                """));
    }

    @Test
    public void testCoinFlip(){
       String outcome = coinTossGame.flip();
       assertNotNull(outcome);
       assertTrue(outcome.equals("HEADS")||outcome.equals("TAILS"));
    }

    @Test
    public void testCountOutcome(){
        coinTossGame.flip();
        assertTrue(coinTossGame.getHeadsCount()==1||coinTossGame.getTailsCount()==1);
    }




}
