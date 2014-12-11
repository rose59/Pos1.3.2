package tw.item.com;

import java.util.List;

/**
 * Created by 欣 on 2014/12/10.
 */
public class ChangeSecond extends SetItemProperty {
    public ChangeSecond(List<Pair> pairList, ItemSort itemSort) {
        super(pairList, itemSort);
    }

    @Override
    public void changeItemProperty(Pair temp, ItemSort itemSort) {
        itemSort.setItemSecond();

    }
}
