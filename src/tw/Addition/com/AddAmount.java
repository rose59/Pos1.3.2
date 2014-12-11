package tw.Addition.com;

import tw.item.com.ChangeAmount;
import tw.item.com.ItemSort;
import tw.item.com.Pair;

import java.util.List;

/**
 * Created by 欣 on 2014/12/9.
 */
public class AddAmount extends AddItem<Integer>  {
//    public AddAmount(List<ItemSort> listItem, List<Pair> listRead) {
//        super(listItem, listRead);
//    }

    @Override
    public Integer addItem(List<Pair> listRead, ItemSort itemSort) {
        new ChangeAmount(listRead, itemSort);
        return itemSort.getAmount();
    }
}
