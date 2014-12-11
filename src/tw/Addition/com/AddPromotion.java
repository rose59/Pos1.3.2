package tw.Addition.com;

import tw.item.com.ChangePromotion;
import tw.item.com.ItemSort;
import tw.item.com.Pair;

import java.util.List;

/**
 * Created by 欣 on 2014/12/9.
 */
public class AddPromotion extends AddItem<Double> {
//    public AddPromotion(List<ItemSort> listItem, List<Pair> listRead) {
//        super(listItem, listRead);
//    }

    @Override
    public Double addItem(List<Pair> listRead, ItemSort itemSort) {
        new ChangePromotion(listRead,itemSort);
        return itemSort.getPromotion();
    }
}
