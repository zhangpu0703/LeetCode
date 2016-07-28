public class Solution {
    public int maxSubArray(int[] nums) {
        int[] sum = new int[nums.length];
        if (nums.length == 0) return 0;
        sum[0]=nums[0];
        for (int i=1; i<nums.length; i++){
            sum[i]= Math.max(sum[i-1],0)+nums[i];
        }
        int res = sum[0];
        for (int s : sum) res = Math.max(res,s);
        return res;
    }
}