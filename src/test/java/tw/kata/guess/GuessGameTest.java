package tw.kata.guess;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class GuessGameTest {

    private GenerateRule generateRule;
    private MatchRule matchRule;
    private GuessGame guessGame;

    @Before
    public void setUp() {
        generateRule = mock(GenerateRule.class);
        matchRule = mock(MatchRule.class);
        guessGame = new GuessGame(generateRule, matchRule);
    }

    @Test
    public void shouldGuessGameGivenGenerateRuleAndMatchRule() {
        when(generateRule.generate()).thenReturn("4235");
        when(matchRule.match("4235", "1234")).thenReturn("2A1B");

        assertThat(guessGame.guess("1234"), is("2A1B"));
    }
}
