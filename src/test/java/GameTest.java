import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private Game game;

    @Nested
    class NormalTest {

        @BeforeEach
        void setUp() {
            game = new Game("123");
        }

        @Test
        void threeStrikeTest() {
            Result ret = game.guess("123");

            assertEquals(3, ret.getStrikes());
            assertEquals(0, ret.getBalls());
        }

        @Test
        void twoStrikeZeroBallTest() {
            Result ret = game.guess("129");

            assertEquals(2, ret.getStrikes());
            assertEquals(0, ret.getBalls());
        }

        @Test
        void oneStrikeTwoBallTest() {
            Result ret = game.guess("132");

            assertEquals(1, ret.getStrikes());
            assertEquals(2, ret.getBalls());
        }

        @Test
        void oneStrikeTest() {
            Result ret = game.guess("195");

            assertEquals(1, ret.getStrikes());
            assertEquals(0, ret.getBalls());
        }

        @Test
        void threeBallTest() {
            Result ret = game.guess("312");

            assertEquals(0, ret.getStrikes());
            assertEquals(3, ret.getBalls());
        }

        @Test
        void noStrikeNoBallTest() {
            Result ret = game.guess("456");

            assertEquals(0, ret.getStrikes());
            assertEquals(0, ret.getBalls());
        }
    }
}