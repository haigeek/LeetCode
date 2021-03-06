/**
 * @author zhaohj
 * @date 2021-03-01 10:58 下午
 * @Description 买卖股票的最佳时机
 */
public class BestTimeToBuyAndSellStockI {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=0;
        for (int price : prices) {
            max = Math.max(max, price - min);
            min = Math.min(min, price);
        }
        return max;
    }
}
