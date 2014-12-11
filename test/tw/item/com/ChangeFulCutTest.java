package tw.item.com;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ChangeFulCutTest {

    private List<Pair> list;

    @Before
    public void setUp() throws Exception {
        list = new ArrayList<Pair>();
        list.add(new Pair("item01", 50));
        list.add(new Pair("item02", 60));
    }

    @Test
    public void should_set_item_FulCut_when_given_FulCutProperty() throws Exception {
        ItemSort itemSort = new ItemSort("item01", 1);
        new ChangeFulCut(list, itemSort);
        assertThat(itemSort.getItemFullCut(), is(5));


    }
}