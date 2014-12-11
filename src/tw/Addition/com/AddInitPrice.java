package tw.Addition.com;

import tw.item.com.ItemSort;
import tw.item.com.Pair;

import java.util.List;

/**
 * Created by 欣 on 2014/12/9.
 */
public class AddInitPrice extends AddItem<Double>{
    public  AddInitPrice( List<Pair> listRead) {
       // List<ItemSort> listItem = new ArrayList<ItemSort>();
        for(Pair pair : listRead) {
            ItemSort sort = new ItemSort(pair.GetName(), pair.GetValue());
            this.listItem.add(sort);
        }
    }


    @Override
    public Double addItem(List<Pair> listRead,ItemSort itemSort) {
        return null;
    }
}
