package tw.Addition.com;

import tw.item.com.ChangeSecond;
import tw.item.com.ItemSort;
import tw.item.com.Pair;

import java.util.List;

/**
 * Created by 欣 on 2014/12/9.
 */
public class AddSecond extends AddItem<Double> {
//    public AddSecond(List<ItemSort> listItem, List<Pair> listRead) {
//        super(listItem, listRead);
//    }

    @Override
    public Double addItem(List<Pair> listRead,ItemSort itemSort) {
         new ChangeSecond(listRead,itemSort);
        return itemSort.getSecond();
    }
}
