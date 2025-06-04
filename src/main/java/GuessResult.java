public class GuessResult {
    private int strikes = 0;
    private int balls = 0;

    public GuessResult(int strikes, int balls) {
        this.strikes = strikes;
        this.balls = balls;
    }

    public static GuessResult of(int i, int i1) {
        return new GuessResult(i, i1);
    }

    public int getStrikes() {
        return strikes;
    }

    public int getBalls() {
        return balls;
    }
}
