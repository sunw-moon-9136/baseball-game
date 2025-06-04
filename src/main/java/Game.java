public class Game {

    private final String answer;
    private final char[] answerCharArr;

    public Game(String answer) {
        this.answer = answer;
        answerCharArr = answer.toCharArray();

        for (int i = 0; i < answerCharArr.length; i++) {
            if (answerCharArr[i] > '9' || answerCharArr[i] < '0') {
                throw new IllegalArgumentException("Answer should be 3 digits");
            }
        }
    }

    public Result guess(String trial) {
        if (answer.equals(trial))
            return Result.of(3, 0);

        char[] trialCharArr = trial.toCharArray();
        Result result = Result.of();

        for (int i = 0; i < 3; i++) {
            if (answerCharArr[i] == trialCharArr[i]) {
                result.addStrike();
                continue;
            }

            checkBallByLetter(trialCharArr[i], result);
        }

        return result;
    }

    private void checkBallByLetter(char trialChar, Result result) {
        for (int j = 0; j < 3; j++) {
            if (answerCharArr[j] == trialChar)
                result.addBall();
        }
    }
}
