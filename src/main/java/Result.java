public class Result {
    private int strikes;
    private int balls;

    public Result(int strikes, int balls) {
        this.strikes = strikes;
        this.balls = balls;
    }

    public void addStrike() {
        strikes++;
    }

    public void addBall() {
        balls++;
    }

    public static Result of(int strikes, int balls) {
        return new Result(strikes, balls);
    }

    public int getStrikes() {
        return strikes;
    }

    public int getBalls() {
        return balls;
    }
}
