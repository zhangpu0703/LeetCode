public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length==0) return 0;
        int curmin = prices[0];
        int res = 0;
        for (int i=0; i<prices.length; i++){
            if (prices[i]<curmin) curmin=prices[i];
            else res = Math.max(res,prices[i]-curmin);
        }
        return res;
    }
}