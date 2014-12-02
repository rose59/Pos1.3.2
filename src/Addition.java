/**
 * Created by 欣 on 2014/12/2.
 */

import java.util.ArrayList;
import java.util.List;
public class Addition extends Extract {

    public List<ItemSort> InitializationItem(List<Pair> listRead) {
        List<ItemSort> listItem = new ArrayList<ItemSort>();
        for(Pair pair : listRead) {
            ItemSort sort = new ItemSort(pair.GetName(), pair.GetValue().doubleValue());
            listItem.add(sort);
        }
        return listItem;
    }
    public void AddItem_Property_Amount(List<ItemSort> listItem,List<Pair> listRead) {
        for (int j = 0; j < listItem.size(); j++) {
            ItemSort itemSort = listItem.get(j);
            itemSort.GetItemAmount(listRead);
        }
    }
    public void AddItem_Property_Promotion(List<ItemSort> listItem,List<Pair> listRead) {
        for (int j = 0; j < listItem.size(); j++) {
            ItemSort itemSort = listItem.get(j);
            itemSort.SetItemPromotion(listRead);
        }
    }
    public void AddItem_Property_Second(List<ItemSort> listItem,List<Pair> listRead) {
        for (int j = 0; j < listItem.size(); j++) {
            ItemSort itemSort = listItem.get(j);
            itemSort.SetItemSecond(listRead);
        }
    }
    public void AddItem_Property_FullCut(List<ItemSort> listItem,List<Pair> listRead) {
        for (int j = 0; j < listItem.size(); j++) {
            ItemSort itemSort = listItem.get(j);
            itemSort.SetItemFullCut(listRead);
        }
    }
}

