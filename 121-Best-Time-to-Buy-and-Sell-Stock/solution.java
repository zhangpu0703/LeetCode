public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int max = 0, cur = prices[0];
        for (int i=1; i<prices.length; i++){
            max = Math.max(max,prices[i]-cur);
            cur = Math.min(cur,prices[i]);
        }
        return max;
    }
}