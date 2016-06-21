public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length==1) return nums[0];
        int f1 = nums[0];
        int f2 = nums[1];
        for (int i=2; i<nums.length; i++){
            int temp = f2;
            f2 = Math.max(nums[i]+f1,f2);
            f1 = Math.max(f1,temp);
        }
        return Math.max(f1,f2);
        
    }
}