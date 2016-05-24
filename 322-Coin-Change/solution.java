public class Solution {
    public int coinChange(int[] coins, int amount) {
        long [] res = new long[amount+1];
        res[0]=0;
        for (int i=1; i<=amount; i++){
            res[i] = Integer.MAX_VALUE;
        }
        for (int i=1; i<=amount; i++){
            for (int coin : coins){
                if (coin<=i) res[i]=Math.min(res[i],res[i-coin]+1);
            }
        }
        if (res[amount]<Integer.MAX_VALUE) return (int)res[amount];
        else return -1;
    }
}