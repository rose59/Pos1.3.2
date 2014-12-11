package tw.Addition.com;

import org.junit.Before;
import org.junit.Test;
import tw.item.com.ItemSort;
import tw.item.com.Pair;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AddItemTest {

    private ArrayList<Pair> pairs;
    private ItemSort itemSort;

    @Before
    public void setUp() throws Exception {
        pairs = new ArrayList<Pair>();
        pairs.add(new Pair("item01", 50));
        pairs.add(new Pair("item02", 30));
        pairs.add(new Pair("item03", 40));
        itemSort = new ItemSort("item01", 20.0);
    }

    @Test
    public void should_get_allAddItem_when_given_listRead_and_list_of_itemSort() throws Exception {
        AddItem<Double> addItem = new AddItem<Double>() {
            @Override
            public Double addItem(List<Pair> listRead, ItemSort itemSort) {
                for (Pair pair : listRead) {
                    if (pair.GetName().equals(itemSort.getItemName()))
                        itemSort.itemPromotion = pair.GetValue();
                }
                return itemSort.itemPromotion;
            }
        };
        addItem.listItem.add(itemSort);
        addItem.AddItem(pairs, addItem.listItem);
        assertThat(addItem.listItem.get(0).getItemPromotion(),is(50.0));
    }
}