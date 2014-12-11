package tw.item.com;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SetItemPropertyTest {

    private ItemSort itemSort;
    private List<Pair> pairList;

    @Before
    public void setUp() throws Exception {
        pairList = new ArrayList<Pair>();
        pairList.add(new Pair("item01", 50));
        pairList.add(new Pair("item02", 60));
        itemSort = new ItemSort("item01", 50);

    }

    @Test
    public void should_set_item_property_when_given_item_property() throws Exception {
        new SetItemProperty(pairList, itemSort) {
            @Override
            public void changeItemProperty(Pair pair, ItemSort itemSort) {
                itemSort.promotion = pair.GetValue();
            }
        };
        assertThat(itemSort.getPromotion(), is(50.0));
    }
}