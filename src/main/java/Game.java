public class Game {

    public static final String TEMP_ANSWER = "123";

    private final String answer = TEMP_ANSWER;

    public Result guess(String trial) {
        if (answer.equals(trial))
            return Result.of(3, 0);

        throw new IllegalArgumentException("Illegal Argument: " + trial);
    }
}
