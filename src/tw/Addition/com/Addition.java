package tw.Addition.com; /**
 * Created by 欣 on 2014/12/2.
 */

import tw.Parse.com.Extract;
import tw.item.com.ItemSort;
import tw.item.com.Pair;

import java.util.ArrayList;
import java.util.List;
public class Addition extends Extract {
    protected List<ItemSort> listItem=new ArrayList<ItemSort>();

    public List<ItemSort> InitializationItem(List<Pair> listRead) {

        AddInitPrice addInitPrice=new AddInitPrice(listRead);
        return this.listItem=addInitPrice.listItem;
    }
    public void addItemPropertyAmount(List<Pair> listRead) {
        AddAmount addAmount = new AddAmount();
        addAmount.AddItem(listRead,this.listItem);
    }
    public List<ItemSort> addItemPropertyPromotion( List<Pair> listRead) {
      AddPromotion addPromotion=new AddPromotion();
        addPromotion.AddItem(listRead,this.listItem);
        return this.listItem;
    }
    public void addItemPropertySecond(List<Pair> listRead) {
        AddSecond addSecond=new AddSecond();
        addSecond.AddItem(listRead,this.listItem);
    }
    public void addItemPropertyFullCut( List<Pair> listRead) {
        AddFulCut addFulCut=new AddFulCut();
        addFulCut.AddItem(listRead,this.listItem);
    }

    public List<ItemSort> getListItem() {
        return this.listItem;
    }

}

