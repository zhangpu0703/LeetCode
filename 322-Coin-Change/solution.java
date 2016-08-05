public class Solution {
    public int coinChange(int[] coins, int amount) {
        long[] dp = new long[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        for (int c : coins){
            if (c<=amount) dp[c]=1;
        }
        dp[0]=0;
        for (int i=1; i<=amount; i++){
            for (int c : coins){
                if (c<i){
                    dp[i]=Math.min(dp[i],dp[i-c]+1);
                }
            }
        }
        if (dp[amount]==Integer.MAX_VALUE) return -1;
        else return (int) dp[amount];
    }
}