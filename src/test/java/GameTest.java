import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void threeStrikeTest() {
        Game game = new Game();

        GuessResult ret = game.guess("123");

        assertEquals(ret.getStrikes(), 3);
        assertEquals(ret.getBalls(), 0);
    }
}