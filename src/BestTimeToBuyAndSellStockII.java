/**
 * @author zhaohj
 * @date 2021-03-01 10:58 下午
 * @Description 买卖股票的最佳时机 II
 */
public class BestTimeToBuyAndSellStockII {
    //贪心法
    public int maxProfit(int[] prices) {
        int profit=0;
        for (int i=1;i<prices.length;i++){
            if (prices[i]>prices[i-1]) {
                 profit = profit+prices[i]-prices[i-1];
            }
        }
        return profit;
    }
    //动态规划法
    public int maxProfit2(int[] prices) {
        int n=prices.length;
        int[][] dp=new int[n][2];
        //dp[n][0]代表不持有股票的收益 dp[n][1]代表持有股票的收益
        dp[0][0]=0;
        //持有相当于买入 收益需要股价
        dp[0][1]= -prices[0];
        for (int i=1;i<prices.length;i++){
            //1、昨天也是不持有 2、昨天持有今天卖出
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            //1、昨天也是持有 2、昨天不持有今天买入
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
        }
        //最终股票是卖出的
        return dp[n-1][0];
    }
}
