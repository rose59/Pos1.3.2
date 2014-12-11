package tw.item.com;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ItemTest {

    private Item item;

    @Before
    public void setUp() throws Exception {
        item = new Item("item01", 50);

    }

    @Test
    public void should_get_itemName_when_given_itemList() throws Exception {
        assertThat(item.getName(), is("item01"));

    }

    @Test
    public void should_get_itemPrice_when_given_itemList() throws Exception {
        assertThat(item.getPrice(), is(50.0));

    }
}