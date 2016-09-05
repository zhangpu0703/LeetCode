public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums==null || nums.length == 0) return Integer.MIN_VALUE;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i=1; i<nums.length; i++){
            dp[i] = Math.max(dp[i-1],0)+nums[i];
        }
        int max = Integer.MIN_VALUE;
        for (int v : dp) max = Math.max(max,v);
        return max;
    }
}