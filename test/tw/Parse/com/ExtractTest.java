package tw.Parse.com;

import org.junit.Test;
import tw.item.com.Pair;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ExtractTest {
    @Test
    public void should_get_pair_when_given_line() throws Exception {
        Extract extract = new Extract();
        Pair pair1 = extract.convert("abc:1");
        Pair pair2=extract.convert("abc-2");
        Pair pair3=extract.convert("abc");
        assertThat(pair1.GetName(), is("abc"));
        assertThat(pair1.GetValue(), is(1));
        assertThat(pair2.GetValue(),is(2));
        assertThat(pair3.GetValue(),is(1));
    }
}