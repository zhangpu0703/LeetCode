public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        if (amount == 0) return 0;
        for (int c:coins){
            if (c<=amount) dp[c]=1;
        }
        dp[0]=0;
        for (int i = 1; i<=amount; i++){
            for (int c:coins){
                if (c<=i && dp[i-c]!=Integer.MAX_VALUE) dp[i]=Math.min(dp[i],dp[i-c]+1);
            }
        }
        if (dp[amount]==Integer.MAX_VALUE) return -1;
        return dp[amount];
    }
}