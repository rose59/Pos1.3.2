package tw.Pos.com;

import tw.item.com.ItemSort;

import java.util.List;

/**
 * Created by 欣 on 2014/12/2.
 */
public class Pos {
    private double allSum;
    private double allSumPromotion;
    private List<ItemSort> listItem;

    public Pos(List<ItemSort> list) {
        this.listItem = list;
    }

    public boolean Display() {
        System.out.println("购物明细" + " " + "(数量" + " " + "单价" + " " + "小计）");
        this.allSumPromotion = calculatedAllSumPromotion();
        this.allSum = calculatedAllSum();
        // System.out.println();
        for (ItemSort aListItem : listItem) {
            System.out.println(aListItem.getItemName() + "  " + aListItem.itemAmount + "  " + aListItem.getItemPrice() + "   " + aListItem.itemPromotionSum);
        }
        System.out.println("总计金额" + " " + "(优惠前" + " " + "优惠后" + " " + "优惠差价）");
        System.out.println(allSumPromotion + "    " + allSum + "    " + allSumPromotion + "   " + (allSum - allSumPromotion));
        return true;
    }

    protected double calculatedAllSumPromotion() {
        for (ItemSort aListItem : listItem) {
            aListItem.itemPromotionSum = aListItem.getItemPromotionSum();
            allSumPromotion = allSumPromotion + aListItem.itemPromotionSum;
        }
        return allSumPromotion - (int) allSumPromotion / 100 * 10;
    }

    protected double calculatedAllSum() {
        for (ItemSort aListItem : listItem) {
            aListItem.itemSortSum = aListItem.getItemSortSum();
            allSum = allSum + aListItem.itemSortSum;
        }
        return allSum;
    }
}
