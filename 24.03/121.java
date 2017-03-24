public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length<=1) return 0;
        
        
        int min = prices[0], profit = 0;
        for (int i = 1; i < prices.length; i++) {
            
            profit = Math.max(prices[i]-min, profit);
            min = Math.min(min, prices[i]);

        }
        
        return profit;
    }
}