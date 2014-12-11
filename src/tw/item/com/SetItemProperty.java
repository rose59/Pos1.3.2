package tw.item.com;

import java.util.List;

/**
 * Created by 欣 on 2014/12/10.
 */
public abstract class SetItemProperty {
    public SetItemProperty(List<Pair> pairList, ItemSort itemSort) {
        for (Pair temp : pairList) {
            if (itemSort.getName().equals(temp.GetName()))
                changeItemProperty(temp, itemSort);

        }
    }

    public abstract void changeItemProperty(Pair temp, ItemSort itemSort);
}
