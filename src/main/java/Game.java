public class Game {

    String answer = "123";

    public GuessResult guess(String number) {
        if (answer.equals(number))
            return GuessResult.of(3, 0);

        throw new IllegalArgumentException();
    }
}
