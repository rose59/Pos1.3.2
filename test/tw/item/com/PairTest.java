package tw.item.com;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PairTest {

    @Test
    public void should_get_Pair_when_given_string_and_value() throws Exception {
        Pair pairInt = new Pair("item01", 50);
        Pair pairDouble = new Pair("item02", "30");
        assertThat(pairInt.GetValue(), is(50));
        assertThat(pairDouble.GetValue(), is(30));

    }
}