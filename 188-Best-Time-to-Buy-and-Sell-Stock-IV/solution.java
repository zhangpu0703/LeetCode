public class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n==0) return 0;
        if (k>=n/2){
            int max = 0;
            for (int i=1; i<prices.length; i++){
                if (prices[i]>prices[i-1]){
                    max+=prices[i]-prices[i-1];
                }
            }
            return max;
        }
        int[][] res = new int[k+1][n];
        
        for (int i=1; i<=k; i++){
            int localmax = -prices[0];
            for (int j = 1; j<n; j++){
                res[i][j]=Math.max(res[i][j-1],localmax+prices[j]);
                localmax = Math.max(localmax,res[i-1][j]-prices[j]);            
            }
        }
        
        return res[k][n-1];
    }
}