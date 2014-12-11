package tw.item.com;

/**
 * Created by 欣 on 2014/12/2.
 */
public class ItemSort extends Item {
    public int amount;
    public double promotionSum;
    public double sortSum;
    public double promotion = 1;
    protected double second = 1;
    public int fullCut = 0;

    public ItemSort(String itemName, double price) {
        super(itemName, price);
    }
    public ItemSort(String name,double price,double promotion,double second,int fulCut,int Amount){
        super(name,price);
        this.amount =Amount;
        this.promotion =promotion;
        this.second =second;
        this.fullCut =fulCut;

    }

    public void setAmount(Pair pair) {
        this.amount +=pair.GetValue();

    }

    public void setPromotion(Pair pair) {

        this.promotion =pair.GetValue().doubleValue()/100;
    }

    public void setItemSecond() {
        this.second =0.5;

    }

    public void setItemFullCut() {
        this.fullCut =5;

    }

    public double CalculatePromotion() {
        this.promotionSum =((this.amount / 2) * (this.second + 1) + this.amount % 2) * this.promotion * this.price;
        int anInt = (int) (this.promotionSum / 100);
        this.promotionSum =this.promotionSum - anInt *this.fullCut;
        return promotionSum;
    }

    public double CalculateSum() {
        this.sortSum =this.amount * this.getPrice();
        return sortSum;
    }

    public int getAmount() {
        return this.amount;
    }

    public double getSortSum() {
        this.sortSum =CalculateSum();
        return sortSum;
    }

    public double getPromotionSum() {
        this.promotionSum =CalculatePromotion();
        return promotionSum;
    }

    public double getSecond() {
        return second;
    }

    public double getPromotion() {
        return this.promotion;
    }

    public int getFullCut() {
        return fullCut;
    }

}
