import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void threeStrikeTest() {
        Game game = new Game();

        Result ret = game.guess("123");

        assertEquals(3, ret.getStrikes());
        assertEquals(0, ret.getBalls());
    }

    @Test
    void twoStrikeZeroBallTest() {
        Game game = new Game();

        Result ret = game.guess("129");

        assertEquals(2, ret.getStrikes());
        assertEquals(0, ret.getBalls());
    }
}