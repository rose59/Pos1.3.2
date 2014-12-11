package tw.item.com;

import java.util.List;

/**
 * Created by 欣 on 2014/12/10.
 */
public class ChangePromotion extends SetItemProperty {
    public ChangePromotion(List<Pair> pairList, ItemSort itemSort) {
        super(pairList, itemSort);
    }

    @Override
    public void changeItemProperty(Pair temp, ItemSort itemSort) {
        itemSort.setItemPromotion(temp);
    }
}
