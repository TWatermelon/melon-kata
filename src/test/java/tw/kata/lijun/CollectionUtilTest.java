package tw.kata.lijun;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static tw.kata.lijun.CollectionUtil.getOdds;

public class CollectionUtilTest {
    @Test
    public void should_get_odd_numbers_given_number_list() {
        List<Integer> numberList = asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        assertThat(getOdds(numberList), is(asList(1, 3, 5, 7, 9)));
    }
}
