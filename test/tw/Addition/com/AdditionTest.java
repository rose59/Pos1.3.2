package tw.Addition.com;

import org.junit.Before;
import org.junit.Test;
import tw.item.com.ItemSort;
import tw.item.com.Pair;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyList;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class AdditionTest {
    private ArrayList<Pair> pairList;
    private List<ItemSort> itemSortList;
    private Addition additionSpy;
    //    private Parse parseMock;
//    private List<Pair> listRead;
//    private Addition addition = new Addition();
//    private List<ItemSort> itemSortList;
//    private List<Pair> list;
//    //private tw.Addition.com.Addition additionMock;
//
//      @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
//    @Before
//    public void setUp() throws Exception {
//        parseMock = mock(Parse.class);
//        listRead = new ArrayList<Pair>();
//        Pair pairPrice = new Pair("item0001", "50");
//        listRead.add(pairPrice);
//        Pair pairPromotion = new Pair("item0002", "75");
//        listRead.add(pairPromotion);
//        Pair pairSecond = new Pair("item0003", "40");
//        listRead.add(pairSecond);
//        when(parseMock.Parse(anyString())).thenReturn(listRead);
//        list = parseMock.Parse("1");
//    }
//
//    @Test
//    public void should_get_price_when_given_listRead() throws Exception {
        //itemSortList = addition.InitializationItem(list);
        //   addition.addItemPropertyPromotion(itemSortList,list);
    //    MatcherAssert.assertThat(itemSortList.get(0).getItemPrice(), is(50.0));
        //  assertThat(itemSortList.get(0).itemPromotion,is(0.5));
        //verify(listRead, (VerificationMode) addition.InitializationItem(additionMock.tw.Parse.com.Parse("1")));

  //  }

//    @Test
//    public void should_get_Promotion_when_given_listRead() throws Exception {
//        Addition additionMock= mock(Addition.class);
       // List<tw.item.com.ItemSort> itemSortList1 = null;
//        List<ItemSort> listSortMock = new ArrayList();
//        ItemSort itemSort1 = new ItemSort("item0001", 50);
//        ItemSort itemSort2 = new ItemSort("item0002", 60);
//        ItemSort itemSort3 = new ItemSort("item0003", 70);
//        listSortMock.add(itemSort1);
//        listSortMock.add(itemSort2);
//        listSortMock.add(itemSort3);
       // when(additionMock.InitializationItem(anyList())).thenReturn(listSortMock);
      //  List<ItemSort> itemSortList = additionMock.InitializationItem(new ArrayList());
      //  additionMock.addItemPropertyPromotion(itemSortList, list);
//        System.out.println(list.get(0).GetValue());
//        System.out.println(itemSortList.get(0).getItemPromotion());
//        MatcherAssert.assertThat(itemSortList.get(0).getItemPromotion(), is(0.5));
//
//    }

//    @Test
//    public void should_get_Amount_when_given_listRead() throws Exception {
//
//        additionMock.addItemPropertyAmount(itemSortList,list);
//        assertThat(itemSortList.get(1).itemAmount,is(50));
//
//    }

    @Before
    public void setUp() throws Exception {
        pairList = new ArrayList<Pair>();
        pairList.add(new Pair("item01", 50));
        pairList.add(new Pair("item02", 30));
        pairList.add(new Pair("item03", 40));
        itemSortList = new ArrayList<ItemSort>();
        itemSortList.add(new ItemSort("item01", 10));
        itemSortList.add(new ItemSort("item02", 20));
        itemSortList.add(new ItemSort("item03", 30));
        additionSpy = new Addition();
        additionSpy =spy(additionSpy);
        when(additionSpy.InitializationItem(anyList())).thenReturn(itemSortList);

    }

    @Test
    public void should_get_item_Initialization_when_given_list_pair() throws Exception {
        Addition addition = new Addition();
        addition.InitializationItem(pairList);
        assertThat(addition.listItem.get(0).getItemName(),is("item01"));
    }

    @Test
    public void should_get_allItem_promotion_when_Add_given_listRead() throws Exception {

        additionSpy.listItem= additionSpy.InitializationItem(pairList);
        additionSpy.addItemPropertyPromotion(pairList);
        assertThat(additionSpy.listItem.get(0).getItemPromotion(), is(0.5));

    }

    @Test
    public void should_get_allItem_Amount_when_Add_given_listRead() throws Exception {
        additionSpy.listItem=additionSpy.InitializationItem(pairList);
        additionSpy.addItemPropertyAmount(pairList);
        assertThat(additionSpy.listItem.get(1).getItemAmount(),is(30));

    }

    @Test
    public void should_get_allItem_FulCut_when_Add_given_listRead() throws Exception {
        additionSpy.listItem=additionSpy.InitializationItem(pairList);
        additionSpy.addItemPropertyFullCut(pairList);
        assertThat(additionSpy.listItem.get(2).getItemFullCut(),is(5));

    }

    @Test
    public void should_get_allItem_Second_when_Add_given_listRead() throws Exception {
        additionSpy.listItem=additionSpy.InitializationItem(pairList);
        additionSpy.addItemPropertySecond(pairList);
        assertThat(additionSpy.listItem.get(2).getItemSecond(),is(0.5));
    }
}