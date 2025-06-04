import java.util.Arrays;

public class Game {

    public static final String TEMP_ANSWER = "123";

    private final String answer = TEMP_ANSWER;

    public Result guess(String trial) {
        if (answer.equals(trial))
            return Result.of(3, 0);

        char[] answerCharArr = answer.toCharArray();
        char[] trialCharArr = trial.toCharArray();
        Result result = Result.of();

        for (int i = 0; i < 3; i++) {
            if (answerCharArr[i] == trialCharArr[i]) {
                result.addStrike();
                continue;
            }

            for (int j = 0; j < 3; j++) {
                if (answerCharArr[j] == trialCharArr[i])
                    result.addBall();
            }
        }

        return result;
    }
}
