public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums==null || nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        for (int i=1; i<nums.length; i++){
            dp[i]=Math.max(0,dp[i-1])+nums[i];
        }
        int res = Integer.MIN_VALUE;
        for (int s : dp) res = Math.max(res,s);
        return res;
    }
}