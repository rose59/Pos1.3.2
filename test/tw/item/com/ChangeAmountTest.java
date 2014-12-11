package tw.item.com;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ChangeAmountTest {

    private List<Pair> list;

    @Before
    public void setUp() throws Exception {
        list = new ArrayList<Pair>();
        list.add(new Pair("item01", 50));
        list.add(new Pair("item02", 60));

    }

    @Test
    public void should_change_itemSort_Amount_when_given_itemSort_Amount() throws Exception {
        ItemSort itemSort = new ItemSort("item02", 1);
        new ChangeAmount(list, itemSort);
        assertThat(itemSort.getAmount(), is(60));

    }
}