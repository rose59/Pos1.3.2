package tw.Addition.com;

import tw.item.com.ChangeFulCut;
import tw.item.com.ItemSort;
import tw.item.com.Pair;

import java.util.List;

/**
 * Created by 欣 on 2014/12/9.
 */
public class AddFulCut extends AddItem<Integer> {
//    public AddFulCut(List<ItemSort> listItem, List<Pair> listRead) {
//        super(listItem, listRead);
//    }

    @Override
    public Integer addItem(List<Pair> listRead, ItemSort itemSort) {
        new ChangeFulCut(listRead,itemSort);
        return itemSort.getFullCut();
    }
}
