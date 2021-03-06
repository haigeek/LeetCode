/**
 * @author zhaohj
 * @date 2019/3/30 下午5:25
 */
public class Main {
    public static void main(String[] args) {
//        TwoSum t=new TwoSum();
//        int [] array={3,2,4};
//        int [] result=t.twoSum(array,6);
//        System.out.println(result[0]);
//        System.out.println(result[1]);

//
//       RemoveDuplicates t=new RemoveDuplicates();
//       int [] array={0,1,2,2};
//       int result=t.removeDuplicates(array);
//       System.out.println(result);

//        bestTimeToBuyAndSellStockii t = new bestTimeToBuyAndSellStockii();
//        int[] array = {7, 6, 4, 3, 1};
//        int result = t.maxProfit(array);
//        System.out.println(result);

        BestTimeToBuyAndSellStockI t = new BestTimeToBuyAndSellStockI();
        int[] array = {7,6,4,3,1};
        int result = t.maxProfit(array);
        System.out.println(result);

    }
}
