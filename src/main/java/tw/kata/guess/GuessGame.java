package tw.kata.guess;

public class GuessGame {
    private final GenerateRule generateRule;
    private final MatchRule matchRule;

    public GuessGame(GenerateRule generateRule, MatchRule matchRule) {
        this.generateRule = generateRule;
        this.matchRule = matchRule;
    }

    public String guess(String input) {
        return matchRule.match(generateRule.generate(), input);
    }
}
