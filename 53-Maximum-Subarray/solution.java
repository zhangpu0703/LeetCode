public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length==0) return 0;
        int[] res = new int[nums.length];
        res[0]=nums[0];
        for (int i=1; i<nums.length; i++){
            res[i]=Math.max(0,res[i-1])+nums[i];
        }
        int max = Integer.MIN_VALUE;
        for (int i=0; i<res.length; i++){
            max = Math.max(max,res[i]);
        }
        return max;
    }
}