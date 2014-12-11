import tw.Addition.com.Addition;
import tw.Pos.com.Pos;
import tw.item.com.ItemSort;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<ItemSort> listItem;
        Addition addition = new Addition();

        //建立itemSort货品列表
        addition.InitializationItem(addition.Parse("C://itemlist.txt"));
        //形成购物清单ListCart
        addition.addItemPropertyAmount(addition.Parse("C://cart.txt"));
        //加入打折信息
        addition.addItemPropertyPromotion( addition.Parse("C://discount_promotion.txt"));
        //加入半价信息
        addition.addItemPropertySecond(addition.Parse("C://second_half_price_promotion.txt"));
        //单个商品满减
        addition.addItemPropertyFullCut( addition.Parse("C://Item_FullCut.txt"));
        listItem=addition.getListItem();
        Pos pos = new Pos(listItem);
        pos.Display();

    }
}
