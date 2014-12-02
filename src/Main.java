import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<ItemSort> listItem;
        Addition addition = new Addition();
        //建立itemSort货品列表
        listItem=addition.InitializationItem(addition.Parse("C://itemlist.txt"));
        //形成购物清单ListCart
        addition.AddItem_Property_Amount(listItem,addition.Parse("C://cart.txt"));
        //加入打折信息
        addition.AddItem_Property_Promotion(listItem, addition.Parse("C://discount_promotion.txt"));
        //加入半价信息
        addition.AddItem_Property_Second(listItem,addition.Parse("C://second_half_price_promotion.txt"));
        //单个商品满减
        addition.AddItem_Property_FullCut(listItem, addition.Parse("C://Item_FullCut.txt"));
        Pos pos = new Pos();
        pos.Display(listItem);

    }
}
