package tw.item.com;

/**
 * Created by 欣 on 2014/12/2.
 */
public class Item {
    protected String name;
    protected double price;

    protected Item(String name, double prince) {
        this.name = name;
        this.price = prince;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
