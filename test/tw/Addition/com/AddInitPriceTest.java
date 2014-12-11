package tw.Addition.com;

import org.junit.Before;
import org.junit.Test;
import tw.item.com.Pair;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AddInitPriceTest {

    private List<Pair> list;

    @Before
    public void setUp() throws Exception {
        list = new ArrayList<Pair>();
        list.add(new Pair("item01",50));
        list.add(new Pair("item02",60));
        list.add(new Pair("item03",70));

    }

    @Test
    public void should_get_PriceList_when_given_pairList() throws Exception {
        AddInitPrice addInitPrice=new AddInitPrice(list);
        assertThat(addInitPrice.listItem.get(0).getPrice(),is(50.0));


    }
}