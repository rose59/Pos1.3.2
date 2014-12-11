package tw.Addition.com;

import org.junit.Before;
import org.junit.Test;
import tw.item.com.ItemSort;
import tw.item.com.Pair;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AddAmountTest {

    private List<Pair> list;
    private List<ItemSort> sortList;

    @Before
    public void setUp() throws Exception {
        list = new ArrayList<Pair>();
        sortList=new ArrayList<ItemSort>();
        list.add(new Pair("item01", 50));
        list.add(new Pair("item02", 60));
        list.add(new Pair("item03", 70));
        sortList.add(new ItemSort("item01", 30));
        sortList.add( new ItemSort("item02",40));
        sortList.add(new ItemSort("item03",60));

    }

    @Test
    public void should_get_Amount_when_given_AmountList() throws Exception {
        AddAmount addAmount = new AddAmount();
        addAmount.AddItem(list,sortList);
        assertThat(sortList.get(0).getItemAmount(),is(50));

    }
}