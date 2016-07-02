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
    public void should_get_odd_numbers_given_number_list() {
        assertThat(getOdds(numberList), is(asList(1, 3, 5, 7, 9)));
    }

    @Test
    public void should_get_even_numbers_given_number_list() {
        assertThat(CollectionUtil.getEvens(numberList), is(asList(2, 4, 6, 8, 10)));
    }
}
