public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length<=1) return 0;
        int curMin = prices[0];
        int res = 0;
        for (int i = 1; i< prices.length; i++){
            res = Math.max(res, prices[i]-curMin);
            curMin = Math.min(curMin, prices[i]);
        }
        return res;
    }
}