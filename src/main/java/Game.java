public class Game {

    public static final String TEMP_ANSWER = "123";

    private final String answer = TEMP_ANSWER;

    public Result guess(String trial) {
        if (answer.equals(trial))
            return Result.of(3, 0);

        char[] chars = answer.toCharArray();
        char[] chars2 = trial.toCharArray();
        Result result = Result.of(0,0);

        for (int i=0;i<3;i++){
            if(chars[i] == chars2[i])
                result.addStrike();
        }

        return result;
    }
}
