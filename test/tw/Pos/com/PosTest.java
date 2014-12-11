package tw.Pos.com;

import org.junit.Before;
import org.junit.Test;
import tw.item.com.ItemSort;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PosTest {

    private List<ItemSort> itemSortList;
    private Pos pos;

    @Before
    public void setUp() throws Exception {
        itemSortList = new ArrayList<ItemSort>();
        itemSortList.add(new ItemSort("item01", 50.0, 0.75, 0.5, 2, 5));
        pos = new Pos(itemSortList);

    }

    @Test
    public void should_get_allPromotionSum_when_given_all_itemList() throws Exception {
        assertThat(pos.calculatedAllSumPromotion(),is(138.0));

    }

    @Test
    public void should_get_allSortSum_when_given_all_itemList() throws Exception {
        assertThat(pos.calculatedAllSum(),is(250.0));

    }

    @Test
    public void should_print_PosItem_when_given_list_itemSort() throws Exception {
        assertThat(pos.Display(),is(true));
    }
}