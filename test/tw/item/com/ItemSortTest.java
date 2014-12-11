package tw.item.com;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ItemSortTest {


    private Pair pairAmo;
    private Pair pairPro;
    private ItemSort itemSort;
    private ItemSort item;

    @Before
    public void setUp() throws Exception {
        pairAmo = new Pair("item01", 40);
        pairPro = new Pair("item01", 75);
        item = new ItemSort("item01", 50.0, 0.75, 0.5, 5, 6);
        itemSort = new ItemSort("item01", 50);


    }

    @Test
    public void should_get_itemSort_Property_when_given_itemSort_property() throws Exception {

        assertThat(itemSort.getName() + itemSort.getPrice(), is("item01" + 50.0));


    }

    @Test
    public void should_get_itemSort_fulCut_when_given_itemSort_fulCut() throws Exception {
        itemSort.setItemFullCut();
        assertThat(itemSort.getFullCut(), is(5));
    }

    @Test
    public void should_get_itemSort_second_when_given_itemSort_second() throws Exception {
        itemSort.setItemSecond();
        assertThat(itemSort.getSecond(), is(0.5));

    }

    @Test
    public void should_get_itemSort_Promotion_when_given_itemSort_Promotion() throws Exception {
        itemSort.setPromotion(pairPro);
        assertThat(itemSort.getPromotion(), is(0.75));

    }

    @Test
    public void should_get_itemSort_Amount_when_given_itemSort_Amount() throws Exception {
        itemSort.setAmount(pairAmo);
        assertThat(itemSort.getAmount(), is(40));

    }

    @Test
    public void should_get_itemSort_Sum_when_given_itemSort() throws Exception {
        assertThat(item.getSortSum(), is(300.0));

    }

    @Test
    public void should_get_itemSort_PromotionSum_when_given_itemSort() throws Exception {
        assertThat(item.getPromotionSum(), is(163.75));

    }
}