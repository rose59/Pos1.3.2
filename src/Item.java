/**
 * Created by 欣 on 2014/12/2.
 */
public class Item {
    protected String itemName;
    protected double itemPrice;
    protected Item(String name,double prince) {
        this.itemName = name;
        this.itemPrice = prince;
    }
    public String getItemName(){
        return itemName;
    }
    public double getItemPrice() {
        return itemPrice;
    }
}
