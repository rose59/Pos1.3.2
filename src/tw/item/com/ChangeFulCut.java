package tw.item.com;

import java.util.List;

/**
 * Created by 欣 on 2014/12/10.
 */
public class ChangeFulCut extends SetItemProperty {
    public ChangeFulCut(List<Pair> pairList, ItemSort itemSort) {
        super(pairList, itemSort);
    }

    @Override
    public void changeItemProperty(Pair temp, ItemSort itemSort) {
        itemSort.setItemFullCut();
       // itemSort.itemFullCut = 5;
    }
}
