package tw.item.com;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ChangeSecondTest {
    private List<Pair> list;

    @Before
    public void setUp() throws Exception {
        list = new ArrayList<Pair>();
        list.add(new Pair("item01", 50));
        list.add(new Pair("item02", 60));

    }

    @Test
    public void should_change_itemSort_Second_when_given_itemSort_second() throws Exception {
        ItemSort itemSort = new ItemSort("item02", 3);
        new ChangeSecond(list, itemSort);
        assertThat(itemSort.getSecond(), is(0.5));

    }
}