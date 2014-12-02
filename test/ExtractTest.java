import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ExtractTest {
    @Test
    public void testParseALine() throws Exception {
        Extract extract = new Extract();
        Pair convert = extract.convert("abc:1");

        assertThat(convert.GetName(), is("abc"));
        assertThat(convert.GetValue(), is(1));
    }
}