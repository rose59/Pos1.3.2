package tw.item.com;

/**
 * Created by 欣 on 2014/12/2.
 */
public class ItemSort extends Item {
    public int itemAmount;
    public double itemPromotionSum;
    public double itemSortSum;
    public double itemPromotion = 1;
    protected double itemSecond = 1;
    public int itemFullCut = 0;

    public ItemSort(String itemName, double price) {
        super(itemName, price);
    }
    public ItemSort(String name,double price,double promotion,double second,int fulCut,int Amount){
        super(name,price);
        this.itemAmount=Amount;
        this.itemPromotion=promotion;
        this.itemSecond=second;
        this.itemFullCut=fulCut;

    }

    public void setItemAmount(Pair pair) {
        this.itemAmount+=pair.GetValue();

    }

    public void setItemPromotion(Pair pair) {

        this.itemPromotion=pair.GetValue().doubleValue()/100;
    }

    public void setItemSecond() {
        this.itemSecond=0.5;

    }

    public void setItemFullCut() {
        this.itemFullCut=5;

    }

    public double CalculatePromotion() {
        this.itemPromotionSum=((this.itemAmount / 2) * (this.itemSecond + 1) + this.itemAmount % 2) * this.itemPromotion * this.itemPrice;
        int anInt = (int) (this.itemPromotionSum / 100);
        this.itemPromotionSum=this.itemPromotionSum- anInt *this.itemFullCut;
        return itemPromotionSum;
    }

    public double CalculateSum() {
        this.itemSortSum=this.itemAmount * this.getItemPrice();
        return itemSortSum;
    }

    public int getItemAmount() {
        return this.itemAmount;
    }

    public double getItemSortSum() {
        this.itemSortSum=CalculateSum();
        return itemSortSum;
    }

    public double getItemPromotionSum() {
        this.itemPromotionSum=CalculatePromotion();
        return itemPromotionSum;
    }

    public double getItemSecond() {
        return itemSecond;
    }

    public double getItemPromotion() {
        return this.itemPromotion;
    }

    public int getItemFullCut() {
        return itemFullCut;
    }

}
