package tw.kata.guess;

public interface MatchRule {
    String match(String generated, String input);
}
