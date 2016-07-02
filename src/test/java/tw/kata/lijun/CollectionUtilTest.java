package tw.kata.lijun;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static tw.kata.lijun.CollectionUtil.getOdds;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CollectionUtilTest {

    private List<Integer> numberList;

    @Before
    public void setUp() throws Exception {
        numberList = asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    @Test
    public void shouldGetOddNumbersGivenNumberList() {
        assertThat(getOdds(numberList), is(asList(1, 3, 5, 7, 9)));
    }

    @Test
    public void shouldGetEvenNumbersGivenNumberList() {
        assertThat(CollectionUtil.getEvens(numberList), is(asList(2, 4, 6, 8, 10)));
    }

    @Test
    public void shouldGetListWithDoubleEvensGivenNumberList() {
        assertThat(CollectionUtil.doubleEvens(numberList), is(asList(1, 4, 3, 8, 5, 12, 7, 16, 9, 20)));
    }

    @Test
    public void shouldReturnFoundIfNumberIsInTheNumberList() {
        assertThat(CollectionUtil.findNumber(numberList, 5), is("Hello, 5"));
    }

    @Test
    public void shouldReturnNotFoundIfNumberNotInTheNumberList() {
        assertThat(CollectionUtil.findNumber(numberList, 11), is("Not Found"));
    }
}
