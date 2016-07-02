package tw.kata.lijun;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class CollectionUtilTest {
    @Ignore
    @Test
    public void should_get_odd_numbers_given_number_list() {
        List<Integer> numberList = asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> odds = CollectionUtil.getOdds(numberList);

        assertThat(odds, is(asList(1, 3, 5, 7, 9)));
    }
}
