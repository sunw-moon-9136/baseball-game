public class Game {

    public static final String ERROR_ANSWER_SHOULD_BE_3_DIGITS = "Answer should be 3 digits";
    private final String answer;
    private final char[] answerCharArr;

    public Game(String answer) {
        require3Digits(answer);

        this.answer = answer;
        answerCharArr = answer.toCharArray();

        requireAllNumber();
        requireNotDuplicatedNumber();
    }

    private static void require3Digits(String answer) {
        if (answer.length() > 3)
            throw new IllegalArgumentException(ERROR_ANSWER_SHOULD_BE_3_DIGITS);
    }

    private void requireNotDuplicatedNumber() {
        for (char curChar : answerCharArr) {
            int sameCount = 0;
            for (char diffChar : answerCharArr) {
                if (curChar == diffChar) sameCount++;
            }
            if (sameCount > 1) throw new IllegalArgumentException(ERROR_ANSWER_SHOULD_BE_3_DIGITS);
        }
    }

    private void requireAllNumber() {
        for (char curChar : answerCharArr) {
            if (curChar > '9' || curChar < '0') {
                throw new IllegalArgumentException(ERROR_ANSWER_SHOULD_BE_3_DIGITS);
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
