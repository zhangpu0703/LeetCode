public class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum+=num;
        if (sum%2 == 1) return false;
        return helper(nums,sum/2,0,0);
    }
    public boolean helper(int[] nums, int target, int ind, int sum){
        if (sum == target) return true;
        if (sum>target) return false;
        for (int i=ind; i<nums.length; i++){
            sum+=nums[i];
            if (helper(nums,target,i+1,sum)) return true;
            sum-=nums[i];
        }
        return false;
    }
}