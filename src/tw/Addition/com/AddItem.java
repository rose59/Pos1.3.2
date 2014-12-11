package tw.Addition.com;

import tw.item.com.ItemSort;
import tw.item.com.Pair;

import java.util.List;

/**
 * Created by 欣 on 2014/12/9.
 */
public abstract class AddItem <K> extends Addition{
    //protected List<ItemSort> listItem=new ArrayList<ItemSort>();
    public void AddItem( List<Pair> listRead,List<ItemSort> listItem) {
        for (ItemSort itemSort : listItem) {
            addItem(listRead,itemSort);
        }
    }

    public abstract K addItem(List<Pair> listRead,ItemSort itemSort);
}
