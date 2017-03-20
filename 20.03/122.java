public class Solution {
    public int maxProfit(int[] prices) {
        boolean purchased = false;
        int n = prices.length;
        int profit = 0;
        /*for (int i = 0 ; i < n;) { // идем парами купля->продажа
            while (i+1!=n && prices[i]>=prices[i+1]) i++; //ищем самую низкую стоимость
            if (i+1==n) break;
            profit-=prices[i];
            
            while (i+1!=n && prices[i]<=prices[i+1]) i++;
            profit+=prices[i];

        }*/
        // снова сложная хуйня какая-то
        for (int i = 1; i < n; i++) {
            if (prices[i-1] < prices[i]) profit+=prices[i]-prices[i-1];
        }
        return profit;
    }
}