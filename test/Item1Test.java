import org.junit.Test;

import static org.junit.Assert.*;

public class Item1Test {
    @Test
    public void testItem() throws Exception {
        Item apple = new Item("Apple", 100);

        assertEquals(apple.getItemName(), "Apple");
        fail();
    }
}