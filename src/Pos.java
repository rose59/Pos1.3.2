import java.util.List;

/**
 * Created by 欣 on 2014/12/2.
 */
public class Pos {
    private double allSum;
    private double allSumPromotion;
    public void Display( List<ItemSort> listItem) {
        System.out.println("购物明细" + " " + "(数量" + " " + "单价" + " " + "小计）");
        for (int j = 0;j < listItem.size();j++) {
            listItem.get(j).itemPromotionSum = listItem.get(j).CalculatePromotion();
            listItem.get(j).itemPromotionSum = listItem.get(j).itemPromotionSum - listItem.get(j).itemPromotionSum / 100 * listItem.get(j).itemFullCut;
            listItem.get(j).itemSortSum =listItem.get(j).CalculateSum();
            allSum = allSum +listItem.get(j).itemSortSum;
            allSumPromotion = allSumPromotion + listItem.get(j).itemPromotionSum;
        }
        allSum = allSum - allSum / 100*10;
        System.out.println();
        for(int j = 0;j < listItem.size();j++) {
            System.out.println(listItem.get(j).getItemName()+"  "+listItem.get(j).itemAmount +"  "+listItem.get(j).getItemPrice()+"   "+listItem.get(j).itemPromotionSum);
        }
        System.out.println("总计金额" + " " + "(优惠前" + " " + "优惠后" + " " + "优惠差价）");
        System.out.println(allSumPromotion  + "    " +  allSum  + "    " + allSumPromotion + "   " + (allSum - allSumPromotion));
    }
}
