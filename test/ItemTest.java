import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    @Test
    public void testItem() throws Exception {
        Item apple = new Item("Apple", 100);

        assertEquals(apple.getItemName(), "Apple");
    }
}