import java.util.Iterator;
import java.util.List;

/**
 * Created by 欣 on 2014/12/2.
 */
public class ItemSort extends Item {
    protected int itemAmount;
    protected double itemPromotionSum;
    protected double itemSortSum;
    protected double itemPromotion = 1;
    protected double itemSecond = 1;
    public int itemFullCut = 0;
    protected ItemSort(String itemName,double price){
        super(itemName,price);
    }

    public int GetItemAmount(List<Pair> listCart) {

        for (Pair temp : listCart) {
            if (this.itemName.equals(temp.GetName()))
                this.itemAmount += temp.GetValue().doubleValue();
        }
        return itemAmount;
    }
    public void SetItemPromotion(List<Pair> listPromotion) {
        for (Pair temp : listPromotion) {
            if (this.itemName.equals(temp.GetName()))
                this.itemPromotion = temp.GetValue().doubleValue() / 100;
        }
    }
    public void SetItemSecond(List<Pair> listSecond) {
        for (Pair temp : listSecond) {
            if (this.itemName.equals(temp.GetName())) {
                this.itemSecond = 0.5;
            }
        }
    }
    public void SetItemFullCut(List<Pair> listItemFullCut) {
        for (Pair temp : listItemFullCut) {
            if (this.itemName.equals(temp.GetName())) {
                this.itemFullCut = 5;
            }
        }
    }
    public double CalculatePromotion()
    {
        return  ((this.itemAmount / 2) * (this.itemSecond + 1) + this.itemAmount % 2) * this.itemPromotion * this.itemPrice;
    }
    public double CalculateSum(){
        return this.itemAmount * this.getItemPrice();
    }

}
